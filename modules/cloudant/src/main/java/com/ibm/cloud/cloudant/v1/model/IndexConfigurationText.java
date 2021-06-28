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
 * IndexConfigurationText.
 */
public class IndexConfigurationText extends IndexConfiguration {

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
    private IndexDefinitionText index;

    public Builder(IndexConfiguration indexConfigurationText) {
      this.ddoc = indexConfigurationText.ddoc;
      this.name = indexConfigurationText.name;
      this.type = indexConfigurationText.type;
      this.index = indexConfigurationText.index;
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
    public Builder(IndexDefinitionText index) {
      this.index = index;
    }

    /**
     * Builds a IndexConfigurationText.
     *
     * @return the new IndexConfigurationText instance
     */
    public IndexConfigurationText build() {
      return new IndexConfigurationText(this);
    }

    /**
     * Set the ddoc.
     *
     * @param ddoc the ddoc
     * @return the IndexConfigurationText builder
     */
    public Builder ddoc(String ddoc) {
      this.ddoc = ddoc;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the IndexConfigurationText builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the IndexConfigurationText builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the index.
     *
     * @param index the index
     * @return the IndexConfigurationText builder
     */
    public Builder index(IndexDefinitionText index) {
      this.index = index;
      return this;
    }
  }

  protected IndexConfigurationText(Builder builder) {
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
   * @return a IndexConfigurationText builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

