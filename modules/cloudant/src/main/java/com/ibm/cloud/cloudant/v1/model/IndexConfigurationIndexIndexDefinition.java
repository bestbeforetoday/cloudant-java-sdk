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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Schema for a `json` or `text` query index definition. Indexes of type `text` have additional configuration properties
 * that do not apply to `json` indexes, these are:
 * * `default_analyzer` - the default text analyzer to use * `default_field` - whether to index the text in all document
 * fields and what analyzer to use for that purpose.
 */
public class IndexConfigurationIndexIndexDefinition extends IndexConfigurationIndex {


  /**
   * Builder.
   */
  public static class Builder {
    private Analyzer defaultAnalyzer;
    private IndexTextOperatorDefaultField defaultField;
    private List<IndexField> fields;
    private Boolean indexArrayLengths;
    private Map<String, Object> partialFilterSelector;

    public Builder(IndexConfigurationIndex indexConfigurationIndexIndexDefinition) {
      this.defaultAnalyzer = indexConfigurationIndexIndexDefinition.defaultAnalyzer;
      this.defaultField = indexConfigurationIndexIndexDefinition.defaultField;
      this.fields = indexConfigurationIndexIndexDefinition.fields;
      this.indexArrayLengths = indexConfigurationIndexIndexDefinition.indexArrayLengths;
      this.partialFilterSelector = indexConfigurationIndexIndexDefinition.partialFilterSelector;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IndexConfigurationIndexIndexDefinition.
     *
     * @return the new IndexConfigurationIndexIndexDefinition instance
     */
    public IndexConfigurationIndexIndexDefinition build() {
      return new IndexConfigurationIndexIndexDefinition(this);
    }

    /**
     * Adds an fields to fields.
     *
     * @param fields the new fields
     * @return the IndexConfigurationIndexIndexDefinition builder
     */
    public Builder addFields(IndexField fields) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(fields,
        "fields cannot be null");
      if (this.fields == null) {
        this.fields = new ArrayList<IndexField>();
      }
      this.fields.add(fields);
      return this;
    }

    /**
     * Set the defaultAnalyzer.
     *
     * @param defaultAnalyzer the defaultAnalyzer
     * @return the IndexConfigurationIndexIndexDefinition builder
     */
    public Builder defaultAnalyzer(Analyzer defaultAnalyzer) {
      this.defaultAnalyzer = defaultAnalyzer;
      return this;
    }

    /**
     * Set the defaultField.
     *
     * @param defaultField the defaultField
     * @return the IndexConfigurationIndexIndexDefinition builder
     */
    public Builder defaultField(IndexTextOperatorDefaultField defaultField) {
      this.defaultField = defaultField;
      return this;
    }

    /**
     * Set the fields.
     * Existing fields will be replaced.
     *
     * @param fields the fields
     * @return the IndexConfigurationIndexIndexDefinition builder
     */
    public Builder fields(List<IndexField> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * Set the indexArrayLengths.
     *
     * @param indexArrayLengths the indexArrayLengths
     * @return the IndexConfigurationIndexIndexDefinition builder
     */
    public Builder indexArrayLengths(Boolean indexArrayLengths) {
      this.indexArrayLengths = indexArrayLengths;
      return this;
    }

    /**
     * Set the partialFilterSelector.
     *
     * @param partialFilterSelector the partialFilterSelector
     * @return the IndexConfigurationIndexIndexDefinition builder
     */
    public Builder partialFilterSelector(Map<String, Object> partialFilterSelector) {
      this.partialFilterSelector = partialFilterSelector;
      return this;
    }
  }

  protected IndexConfigurationIndexIndexDefinition(Builder builder) {
    defaultAnalyzer = builder.defaultAnalyzer;
    defaultField = builder.defaultField;
    fields = builder.fields;
    indexArrayLengths = builder.indexArrayLengths;
    partialFilterSelector = builder.partialFilterSelector;
  }

  /**
   * New builder.
   *
   * @return a IndexConfigurationIndexIndexDefinition builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

