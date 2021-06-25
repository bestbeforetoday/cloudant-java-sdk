/*
 * (C) Copyright IBM Corp. 2021.
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
 * The postIndex options.
 */
public class PostIndexOptions extends GenericModel {

  protected String db;
  protected IndexConfiguration indexConfiguration;

  /**
   * Builder.
   */
  public static class Builder {
    private String db;
    private IndexConfiguration indexConfiguration;

    private Builder(PostIndexOptions postIndexOptions) {
      this.db = postIndexOptions.db;
      this.indexConfiguration = postIndexOptions.indexConfiguration;
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
     * @param indexConfiguration the indexConfiguration
     */
    public Builder(String db, IndexConfiguration indexConfiguration) {
      this.db = db;
      this.indexConfiguration = indexConfiguration;
    }

    /**
     * Builds a PostIndexOptions.
     *
     * @return the new PostIndexOptions instance
     */
    public PostIndexOptions build() {
      return new PostIndexOptions(this);
    }

    /**
     * Set the db.
     *
     * @param db the db
     * @return the PostIndexOptions builder
     */
    public Builder db(String db) {
      this.db = db;
      return this;
    }

    /**
     * Set the indexConfiguration.
     *
     * @param indexConfiguration the indexConfiguration
     * @return the PostIndexOptions builder
     */
    public Builder indexConfiguration(IndexConfiguration indexConfiguration) {
      this.indexConfiguration = indexConfiguration;
      return this;
    }
  }

  protected PostIndexOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.db,
      "db cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.indexConfiguration,
      "indexConfiguration cannot be null");
    db = builder.db;
    indexConfiguration = builder.indexConfiguration;
  }

  /**
   * New builder.
   *
   * @return a PostIndexOptions builder
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
   * Gets the indexConfiguration.
   *
   * HTTP request body for postIndex.
   *
   * @return the indexConfiguration
   */
  public IndexConfiguration indexConfiguration() {
    return indexConfiguration;
  }
}

