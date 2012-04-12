/*******************************************************************************
 * Copyright (C) 2011 - 2012 Jochen Wuttke, Jonathan Ramaswamy
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * Contributors:
 *    Jochen Wuttke (wuttkej@gmail.com) - initial API and implementation
 ********************************************************************************
 *
 * Created: Dec 12, 2011
 */

package traffic.algorithm;

import traffic.model.AdasimMap;
import traffic.model.RoadSegment;

/**
 * @author Jochen Wuttke - wuttkej@gmail.com
 *
 */
public abstract class AbstractVehicleStrategy implements VehicleStrategy {
	
	protected AdasimMap graph;
	protected RoadSegment source, target;
	protected int carID;

	/* (non-Javadoc)
	 * @see traffic.algorithm.CarStrategy#setGraph(traffic.graph.Graph)
	 */
	@Override
	public void setGraph(AdasimMap g) {
		this.graph = g;
	}

	@Override
	public void setStartNode( RoadSegment start ) {
		source = start;
	}	
	
	@Override
	public void setEndNode( RoadSegment end ) {
		target = end;
	}
	
	/* (non-Javadoc)
	 * @see traffic.algorithm.CarStrategy#setCarId(int)
	 */
	@Override
	public void setVehicleId(int id) {
		this.carID = id;
	}
	

}