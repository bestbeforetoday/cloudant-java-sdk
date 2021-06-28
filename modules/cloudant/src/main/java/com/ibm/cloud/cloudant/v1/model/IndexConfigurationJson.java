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

/**
 * IndexConfigurationJson.
 */
public class IndexConfigurationJson extends IndexConfiguration {

  /**
   * Schema for the type of an index.
   */
  public interface Type {
    /** json. */
    String JSON = "json";
    /** special. */
    String SPECIAL = "special";
    /** text. */
    String TEXT = "text";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String ddoc;
    private String name;
    private String type;
    private IndexDefinitionJson index;

    public Builder(IndexConfiguration indexConfigurationJson) {
      this.ddoc = indexConfigurationJson.ddoc;
      this.name = indexConfigurationJson.name;
      this.type = indexConfigurationJson.type;
      this.index = indexConfigurationJson.index;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param index the index
     */
    public Builder(IndexDefinitionJson index) {
      this.index = index;
    }

    /**
     * Builds a IndexConfigurationJson.
     *
     * @return the new IndexConfigurationJson instance
     */
    public IndexConfigurationJson build() {
      return new IndexConfigurationJson(this);
    }

    /**
     * Set the ddoc.
     *
     * @param ddoc the ddoc
     * @return the IndexConfigurationJson builder
     */
    public Builder ddoc(String ddoc) {
      this.ddoc = ddoc;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the IndexConfigurationJson builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the IndexConfigurationJson builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the index.
     *
     * @param index the index
     * @return the IndexConfigurationJson builder
     */
    public Builder index(IndexDefinitionJson index) {
      this.index = index;
      return this;
    }
  }

  protected IndexConfigurationJson(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.index,
      "index cannot be null");
    ddoc = builder.ddoc;
    name = builder.name;
    type = builder.type;
    index = builder.index;
  }

  /**
   * New builder.
   *
   * @return a IndexConfigurationJson builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

