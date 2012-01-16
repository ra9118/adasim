
map_s <- function(str) {
	if ( str == "traffic.strategy.LookaheadShortestPathCarStrategy" ) {
		"naive"
	} else {
		"adaptive"
	}
}

plot_data <- function(file) {
	data <- read.table( paste(file, "csv", sep="."), header=T, sep=',')
	p <- tapply( data$Time, list(data$Hops, data$Strategy) , mean)
	l <- levels(data$Strategy)
	pdf( paste(file, "pdf", sep=".") )
	barplot(t(p), beside=T, legend= c( map_s(l[1]) , map_s(l[2]) ))
	dev.off()
}

plot_all_data <- function() {
	files <- list.files( path=".", pattern=".+.csv$" )
	for ( file in files) {
		s <- strsplit( file, ".csv" )
		plot_data(s)
	}
}

plot_time_data <- function(file) {
	data <- read.table( paste(file, "csv", sep="."), header=T, sep=',')
	p <- tapply( data$Time, list(data$Cars, data$Strategy) , mean)
	l <- levels(data$Strategy)
	pdf( paste(file, "pdf", sep=".") )
	barplot(t(p), beside=T, legend= c( map_s(l[1]) , map_s(l[2]) ), xlab ="# of Cars", ylab = "Mean Travel Time", main = "Mean Travel Time by Strategy", args.legend = list( title = "Strategy", x = "topleft" ) )
	dev.off()
}