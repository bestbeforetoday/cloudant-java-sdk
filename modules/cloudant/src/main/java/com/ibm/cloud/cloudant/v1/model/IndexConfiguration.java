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
 * Schema for configuration options for creating an index.
 *
 * Classes which extend this class:
 * - IndexConfigurationJson
 * - IndexConfigurationText
 */
public class IndexConfiguration extends GenericModel {

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

  protected String ddoc;
  protected String name;
  protected String type;
  protected IndexDefinitionJson index;

  protected IndexConfiguration() {
  }

  /**
   * Gets the ddoc.
   *
   * Name of the design document in which the index will be created.
   *
   * @return the ddoc
   */
  public String ddoc() {
    return ddoc;
  }

  /**
   * Gets the name.
   *
   * Index name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Schema for the type of an index.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the index.
   *
   * Schema for a `json` or `text` query index definition. Indexes of type `text` have additional configuration
   * properties that do not apply to `json` indexes, these are:
   * * `default_analyzer` - the default text analyzer to use * `default_field` - whether to index the text in all
   * document fields and what analyzer to use for that purpose.
   *
   * @return the index
   */
  public IndexDefinitionJson index() {
    return index;
  }
}

