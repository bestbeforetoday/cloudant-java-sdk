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
public class IndexConfigurationIndexJsonIndexDefinition extends IndexConfigurationIndex {


  /**
   * Builder.
   */
  public static class Builder {
    private Analyzer defaultAnalyzer;
    private IndexTextOperatorDefaultField defaultField;
    private Boolean indexArrayLengths;
    private Map<String, Object> partialFilterSelector;
    private Map<String, String> fields;

    public Builder(IndexConfigurationIndex indexConfigurationIndexJsonIndexDefinition) {
      this.defaultAnalyzer = indexConfigurationIndexJsonIndexDefinition.defaultAnalyzer;
      this.defaultField = indexConfigurationIndexJsonIndexDefinition.defaultField;
      this.indexArrayLengths = indexConfigurationIndexJsonIndexDefinition.indexArrayLengths;
      this.partialFilterSelector = indexConfigurationIndexJsonIndexDefinition.partialFilterSelector;
      this.fields = indexConfigurationIndexJsonIndexDefinition.fields;
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
    public Builder(Map<String, String> fields) {
      this.fields = fields;
    }

    /**
     * Builds a IndexConfigurationIndexJsonIndexDefinition.
     *
     * @return the new IndexConfigurationIndexJsonIndexDefinition instance
     */
    public IndexConfigurationIndexJsonIndexDefinition build() {
      return new IndexConfigurationIndexJsonIndexDefinition(this);
    }

    /**
     * Set the defaultAnalyzer.
     *
     * @param defaultAnalyzer the defaultAnalyzer
     * @return the IndexConfigurationIndexJsonIndexDefinition builder
     */
    public Builder defaultAnalyzer(Analyzer defaultAnalyzer) {
      this.defaultAnalyzer = defaultAnalyzer;
      return this;
    }

    /**
     * Set the defaultField.
     *
     * @param defaultField the defaultField
     * @return the IndexConfigurationIndexJsonIndexDefinition builder
     */
    public Builder defaultField(IndexTextOperatorDefaultField defaultField) {
      this.defaultField = defaultField;
      return this;
    }

    /**
     * Set the indexArrayLengths.
     *
     * @param indexArrayLengths the indexArrayLengths
     * @return the IndexConfigurationIndexJsonIndexDefinition builder
     */
    public Builder indexArrayLengths(Boolean indexArrayLengths) {
      this.indexArrayLengths = indexArrayLengths;
      return this;
    }

    /**
     * Set the partialFilterSelector.
     *
     * @param partialFilterSelector the partialFilterSelector
     * @return the IndexConfigurationIndexJsonIndexDefinition builder
     */
    public Builder partialFilterSelector(Map<String, Object> partialFilterSelector) {
      this.partialFilterSelector = partialFilterSelector;
      return this;
    }

    /**
     * Set the fields.
     *
     * @param fields the fields
     * @return the IndexConfigurationIndexJsonIndexDefinition builder
     */
    public Builder fields(Map<String, String> fields) {
      this.fields = fields;
      return this;
    }
  }

  protected IndexConfigurationIndexJsonIndexDefinition(Builder builder) {
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
   * @return a IndexConfigurationIndexJsonIndexDefinition builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

