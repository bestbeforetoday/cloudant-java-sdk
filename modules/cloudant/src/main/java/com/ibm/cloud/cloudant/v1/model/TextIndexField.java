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
 * TextIndexField.
 */
public class TextIndexField extends GenericModel {

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

    private Builder(TextIndexField textIndexField) {
      this.name = textIndexField.name;
      this.type = textIndexField.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TextIndexField.
     *
     * @return the new TextIndexField instance
     */
    public TextIndexField build() {
      return new TextIndexField(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the TextIndexField builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the TextIndexField builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected TextIndexField(Builder builder) {
    name = builder.name;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a TextIndexField builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
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

  @Override
  public String toString() {
    return "{name=" + name + ", type=" + type + "}";
  }
}

