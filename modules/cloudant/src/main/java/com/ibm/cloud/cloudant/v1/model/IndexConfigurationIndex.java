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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * IndexConfigurationIndex.
 *
 * Classes which extend this class:
 * - JsonIndexDefinition
 * - TextIndexDefinition
 */
public class IndexConfigurationIndex extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("json", JsonIndexDefinition.class);
    discriminatorMapping.put("text", TextIndexDefinition.class);
  }

  @SerializedName("default_analyzer")
  protected Analyzer defaultAnalyzer;
  @SerializedName("default_field")
  protected IndexTextOperatorDefaultField defaultField;
  @SerializedName("index_array_lengths")
  protected Boolean indexArrayLengths;
  @SerializedName("partial_filter_selector")
  protected Map<String, Object> partialFilterSelector;
  protected Object fields;

  protected IndexConfigurationIndex() {
  }

  /**
   * Gets the defaultAnalyzer.
   *
   * Schema for a full text search analyzer.
   *
   * @return the defaultAnalyzer
   */
  public Analyzer defaultAnalyzer() {
    return defaultAnalyzer;
  }

  /**
   * Gets the defaultField.
   *
   * Schema for the text index default field configuration. The default field is used to index the text of all fields
   * within a document for use with the `$text` operator.
   *
   * @return the defaultField
   */
  public IndexTextOperatorDefaultField defaultField() {
    return defaultField;
  }

  /**
   * Gets the indexArrayLengths.
   *
   * Whether to scan every document for arrays and store the length for each array found. Set the index_array_lengths
   * field to false if:
   * * You do not need to know the length of an array. * You do not use the `$size` operator. * The documents in your
   * database are complex, or not completely under your control. As a result, it is difficult to estimate the impact of
   * the extra processing that is needed to determine and store the arrays lengths.
   *
   * @return the indexArrayLengths
   */
  public Boolean indexArrayLengths() {
    return indexArrayLengths;
  }

  /**
   * Gets the partialFilterSelector.
   *
   * JSON object describing criteria used to select documents. The selector specifies fields in the document, and
   * provides an expression to evaluate with the field content or other data.
   *
   * The selector object must:
   *   * Be structured as valid JSON.
   *   * Contain a valid query expression.
   *
   * Using a selector is significantly more efficient than using a JavaScript filter function, and is the recommended
   * option if filtering on document attributes only.
   *
   * Elementary selector syntax requires you to specify one or more fields, and the corresponding values required for
   * those fields. You can create more complex selector expressions by combining operators.
   *
   * Operators are identified by the use of a dollar sign `$` prefix in the name field.
   *
   * There are two core types of operators in the selector syntax:
   * * Combination operators: applied at the topmost level of selection. They are used to combine selectors. In addition
   * to the common boolean operators (`$and`, `$or`, `$not`, `$nor`) there are three combination operators: `$all`,
   * `$elemMatch`, and `$allMatch`. A combination operator takes a single argument. The argument is either another
   * selector, or an array of selectors.
   * * Condition operators: are specific to a field, and are used to evaluate the value stored in that field. For
   * instance, the basic `$eq` operator matches when the specified field contains a value that is equal to the supplied
   * argument.
   *
   * @return the partialFilterSelector
   */
  public Map<String, Object> partialFilterSelector() {
    return partialFilterSelector;
  }

  /**
   * Gets the fields.
   *
   * @return the fields
   */
  public Object fields() {
    return fields;
  }
}

