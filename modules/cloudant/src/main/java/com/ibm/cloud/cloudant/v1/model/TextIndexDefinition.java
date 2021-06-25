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

import java.util.Map;

/**
 * Schema for a `json` or `text` query index definition. Indexes of type `text` have additional configuration properties
 * that do not apply to `json` indexes, these are:
 * * `default_analyzer` - the default text analyzer to use * `default_field` - whether to index the text in all document
 * fields and what analyzer to use for that purpose.
 */
public class TextIndexDefinition extends IndexConfigurationIndex {


  /**
   * Builder.
   */
  public static class Builder {
    private Analyzer defaultAnalyzer;
    private IndexTextOperatorDefaultField defaultField;
    private Boolean indexArrayLengths;
    private Map<String, Object> partialFilterSelector;
    private TextIndexField fields;

    public Builder(IndexConfigurationIndex textIndexDefinition) {
      this.defaultAnalyzer = textIndexDefinition.defaultAnalyzer;
      this.defaultField = textIndexDefinition.defaultField;
      this.indexArrayLengths = textIndexDefinition.indexArrayLengths;
      this.partialFilterSelector = textIndexDefinition.partialFilterSelector;
      this.fields = (TextIndexField) textIndexDefinition.fields;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param fields the fields
     */
    public Builder(TextIndexField fields) {
      this.fields = fields;
    }

    /**
     * Builds a TextIndexDefinition.
     *
     * @return the new TextIndexDefinition instance
     */
    public TextIndexDefinition build() {
      return new TextIndexDefinition(this);
    }

    /**
     * Set the defaultAnalyzer.
     *
     * @param defaultAnalyzer the defaultAnalyzer
     * @return the TextIndexDefinition builder
     */
    public Builder defaultAnalyzer(Analyzer defaultAnalyzer) {
      this.defaultAnalyzer = defaultAnalyzer;
      return this;
    }

    /**
     * Set the defaultField.
     *
     * @param defaultField the defaultField
     * @return the TextIndexDefinition builder
     */
    public Builder defaultField(IndexTextOperatorDefaultField defaultField) {
      this.defaultField = defaultField;
      return this;
    }

    /**
     * Set the indexArrayLengths.
     *
     * @param indexArrayLengths the indexArrayLengths
     * @return the TextIndexDefinition builder
     */
    public Builder indexArrayLengths(Boolean indexArrayLengths) {
      this.indexArrayLengths = indexArrayLengths;
      return this;
    }

    /**
     * Set the partialFilterSelector.
     *
     * @param partialFilterSelector the partialFilterSelector
     * @return the TextIndexDefinition builder
     */
    public Builder partialFilterSelector(Map<String, Object> partialFilterSelector) {
      this.partialFilterSelector = partialFilterSelector;
      return this;
    }

    /**
     * Set the fields.
     *
     * @param fields the fields
     * @return the TextIndexDefinition builder
     */
    public Builder fields(TextIndexField fields) {
      this.fields = fields;
      return this;
    }
  }

  protected TextIndexDefinition(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fields,
      "fields cannot be null");
    defaultAnalyzer = builder.defaultAnalyzer;
    defaultField = builder.defaultField;
    indexArrayLengths = builder.indexArrayLengths;
    partialFilterSelector = builder.partialFilterSelector;
    fields = builder.fields;
  }

  /**
   * New builder.
   *
   * @return a TextIndexDefinition builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

