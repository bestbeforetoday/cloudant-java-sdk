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
 * Schema for indexed fields for use with declarative JSON query.
 */
public class IndexFieldText extends GenericModel {

  /**
   * The type of the named field.
   */
  public interface Type {
    /** boolean. */
    String X_BOOLEAN = "boolean";
    /** number. */
    String NUMBER = "number";
    /** string. */
    String STRING = "string";
  }

  protected String name;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String type;

    private Builder(IndexFieldText indexFieldText) {
      this.name = indexFieldText.name;
      this.type = indexFieldText.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IndexFieldText.
     *
     * @return the new IndexFieldText instance
     */
    public IndexFieldText build() {
      return new IndexFieldText(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the IndexFieldText builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the IndexFieldText builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected IndexFieldText(Builder builder) {
    name = builder.name;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a IndexFieldText builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the field.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * The type of the named field.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

