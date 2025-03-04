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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Schema for database information keyed by database name.
 */
public class DbsInfoResult extends GenericModel {

  protected String error;
  protected DatabaseInformation info;
  protected String key;

  /**
   * Gets the error.
   *
   * The name of the error.
   *
   * @return the error
   */
  public String getError() {
    return error;
  }

  /**
   * Gets the info.
   *
   * Schema for information about a database.
   *
   * @return the info
   */
  public DatabaseInformation getInfo() {
    return info;
  }

  /**
   * Gets the key.
   *
   * Database name.
   *
   * @return the key
   */
  public String getKey() {
    return key;
  }
}

