/*
 * Licensed to The Apereo Foundation under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * The Apereo Foundation licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/
package org.unitime.timetable.model.base;

import java.io.Serializable;

import org.unitime.timetable.model.CurriculumOverrideReservation;
import org.unitime.timetable.model.CurriculumReservation;

/**
 * Do not change this class. It has been automatically generated using ant create-model.
 * @see org.unitime.commons.ant.CreateBaseModelFromXml
 */
public abstract class BaseCurriculumOverrideReservation extends CurriculumReservation implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer iFlags;


	public static String PROP_OVERRIDE_TYPE = "flags";

	public BaseCurriculumOverrideReservation() {
		initialize();
	}

	public BaseCurriculumOverrideReservation(Long uniqueId) {
		setUniqueId(uniqueId);
		initialize();
	}

	protected void initialize() {}

	public Integer getFlags() { return iFlags; }
	public void setFlags(Integer flags) { iFlags = flags; }

	public boolean equals(Object o) {
		if (o == null || !(o instanceof CurriculumOverrideReservation)) return false;
		if (getUniqueId() == null || ((CurriculumOverrideReservation)o).getUniqueId() == null) return false;
		return getUniqueId().equals(((CurriculumOverrideReservation)o).getUniqueId());
	}

	public int hashCode() {
		if (getUniqueId() == null) return super.hashCode();
		return getUniqueId().hashCode();
	}

	public String toString() {
		return "CurriculumOverrideReservation["+getUniqueId()+"]";
	}

	public String toDebugString() {
		return "CurriculumOverrideReservation[" +
			"\n	Area: " + getArea() +
			"\n	ExpirationDate: " + getExpirationDate() +
			"\n	Flags: " + getFlags() +
			"\n	Inclusive: " + getInclusive() +
			"\n	InstructionalOffering: " + getInstructionalOffering() +
			"\n	Limit: " + getLimit() +
			"\n	StartDate: " + getStartDate() +
			"\n	UniqueId: " + getUniqueId() +
			"]";
	}
}
