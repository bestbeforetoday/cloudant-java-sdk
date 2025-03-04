/*
 * (C) Copyright IBM Corp. 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.cloudant.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Schema for the result of a query view operation.
 */
public class ViewResult extends GenericModel {

  @SerializedName("total_rows")
  protected Long totalRows;
  @SerializedName("update_seq")
  protected String updateSeq;
  protected List<ViewResultRow> rows;

  /**
   * Gets the totalRows.
   *
   * Number of total rows.
   *
   * @return the totalRows
   */
  public Long getTotalRows() {
    return totalRows;
  }

  /**
   * Gets the updateSeq.
   *
   * Current update sequence for the database.
   *
   * @return the updateSeq
   */
  public String getUpdateSeq() {
    return updateSeq;
  }

  /**
   * Gets the rows.
   *
   * rows.
   *
   * @return the rows
   */
  public List<ViewResultRow> getRows() {
    return rows;
  }
}

