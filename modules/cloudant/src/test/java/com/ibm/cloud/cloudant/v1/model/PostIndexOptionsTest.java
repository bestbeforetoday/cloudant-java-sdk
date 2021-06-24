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

import com.ibm.cloud.cloudant.v1.model.Analyzer;
import com.ibm.cloud.cloudant.v1.model.IndexDefinition;
import com.ibm.cloud.cloudant.v1.model.IndexTextOperatorDefaultField;
import com.ibm.cloud.cloudant.v1.model.JsonIndexDefinition;
import com.ibm.cloud.cloudant.v1.model.PostIndexOptions;
import com.ibm.cloud.cloudant.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PostIndexOptions model.
 */
public class PostIndexOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPostIndexOptions() throws Throwable {
    Analyzer analyzerModel = new Analyzer.Builder()
      .name("classic")
      .stopwords(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(analyzerModel.name(), "classic");
    assertEquals(analyzerModel.stopwords(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    IndexTextOperatorDefaultField indexTextOperatorDefaultFieldModel = new IndexTextOperatorDefaultField.Builder()
      .analyzer(analyzerModel)
      .enabled(true)
      .build();
    assertEquals(indexTextOperatorDefaultFieldModel.analyzer(), analyzerModel);
    assertEquals(indexTextOperatorDefaultFieldModel.enabled(), Boolean.valueOf(true));

    JsonIndexDefinition indexConfigurationIndexModel = new JsonIndexDefinition.Builder()
      .defaultAnalyzer(analyzerModel)
      .defaultField(indexTextOperatorDefaultFieldModel)
      .indexArrayLengths(true)
      .partialFilterSelector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .fields(new java.util.HashMap<String, String>() { { put("foo", "asc"); } })
      .build();
    assertEquals(indexConfigurationIndexModel.defaultAnalyzer(), analyzerModel);
    assertEquals(indexConfigurationIndexModel.defaultField(), indexTextOperatorDefaultFieldModel);
    assertEquals(indexConfigurationIndexModel.indexArrayLengths(), Boolean.valueOf(true));
    assertEquals(indexConfigurationIndexModel.partialFilterSelector(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(indexConfigurationIndexModel.fields(), new java.util.HashMap<String, String>() { { put("foo", "asc"); } });

    IndexDefinition indexDefinitionModel = new IndexDefinition.Builder()
      .defaultAnalyzer(analyzerModel)
      .defaultField(indexTextOperatorDefaultFieldModel)
      .indexArrayLengths(true)
      .partialFilterSelector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(indexDefinitionModel.defaultAnalyzer(), analyzerModel);
    assertEquals(indexDefinitionModel.defaultField(), indexTextOperatorDefaultFieldModel);
    assertEquals(indexDefinitionModel.indexArrayLengths(), Boolean.valueOf(true));
    assertEquals(indexDefinitionModel.partialFilterSelector(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    PostIndexOptions postIndexOptionsModel = new PostIndexOptions.Builder()
      .db("testString")
      .index(indexConfigurationIndexModel)
      .ddoc("testString")
      .def(indexDefinitionModel)
      .name("testString")
      .partitioned(true)
      .type("json")
      .build();
    assertEquals(postIndexOptionsModel.db(), "testString");
    assertEquals(postIndexOptionsModel.index(), indexConfigurationIndexModel);
    assertEquals(postIndexOptionsModel.ddoc(), "testString");
    assertEquals(postIndexOptionsModel.def(), indexDefinitionModel);
    assertEquals(postIndexOptionsModel.name(), "testString");
    assertEquals(postIndexOptionsModel.partitioned(), Boolean.valueOf(true));
    assertEquals(postIndexOptionsModel.type(), "json");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPostIndexOptionsError() throws Throwable {
    new PostIndexOptions.Builder().build();
  }

}