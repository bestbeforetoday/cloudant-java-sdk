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
 * The getGeoIndexInformation options.
 */
public class GetGeoIndexInformationOptions extends GenericModel {

  protected String db;
  protected String ddoc;
  protected String index;

  /**
   * Builder.
   */
  public static class Builder {
    private String db;
    private String ddoc;
    private String index;

    private Builder(GetGeoIndexInformationOptions getGeoIndexInformationOptions) {
      this.db = getGeoIndexInformationOptions.db;
      this.ddoc = getGeoIndexInformationOptions.ddoc;
      this.index = getGeoIndexInformationOptions.index;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param db the db
     * @param ddoc the ddoc
     * @param index the index
     */
    public Builder(String db, String ddoc, String index) {
      this.db = db;
      this.ddoc = ddoc;
      this.index = index;
    }

    /**
     * Builds a GetGeoIndexInformationOptions.
     *
     * @return the new GetGeoIndexInformationOptions instance
     */
    public GetGeoIndexInformationOptions build() {
      return new GetGeoIndexInformationOptions(this);
    }

    /**
     * Set the db.
     *
     * @param db the db
     * @return the GetGeoIndexInformationOptions builder
     */
    public Builder db(String db) {
      this.db = db;
      return this;
    }

    /**
     * Set the ddoc.
     *
     * @param ddoc the ddoc
     * @return the GetGeoIndexInformationOptions builder
     */
    public Builder ddoc(String ddoc) {
      this.ddoc = ddoc;
      return this;
    }

    /**
     * Set the index.
     *
     * @param index the index
     * @return the GetGeoIndexInformationOptions builder
     */
    public Builder index(String index) {
      this.index = index;
      return this;
    }
  }

  protected GetGeoIndexInformationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.db,
      "db cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.ddoc,
      "ddoc cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.index,
      "index cannot be empty");
    db = builder.db;
    ddoc = builder.ddoc;
    index = builder.index;
  }

  /**
   * New builder.
   *
   * @return a GetGeoIndexInformationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the db.
   *
   * Path parameter to specify the database name.
   *
   * @return the db
   */
  public String db() {
    return db;
  }

  /**
   * Gets the ddoc.
   *
   * Path parameter to specify the design document name. The design document name is the design document ID excluding
   * the `_design/` prefix.
   *
   * @return the ddoc
   */
  public String ddoc() {
    return ddoc;
  }

  /**
   * Gets the index.
   *
   * Path parameter to specify the index name.
   *
   * @return the index
   */
  public String index() {
    return index;
  }
}

