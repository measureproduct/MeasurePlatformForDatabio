/*******************************************************************************
 * Copyright (C) 2019 Softeam
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.measure.platform.service.analysis.data.alert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Notification collected by the Measure Platform and consume by the external analysis tools.
 */
public class AlertReport {
	
	private Date from;
	
	private List<AlertData> alerts = new ArrayList<>();

	public Date getFrom() {
		return this.from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public List<AlertData> getAlerts() {
		return this.alerts;
	}

	public void setAlerts(List<AlertData> alerts) {
		this.alerts = alerts;
	}

}
