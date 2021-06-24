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
import com.ibm.cloud.cloudant.v1.model.IndexTextOperatorDefaultField;
import com.ibm.cloud.cloudant.v1.model.JsonIndexDefinition;
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
 * Unit test class for the JsonIndexDefinition model.
 */
public class JsonIndexDefinitionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJsonIndexDefinition() throws Throwable {
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

    JsonIndexDefinition jsonIndexDefinitionModel = new JsonIndexDefinition.Builder()
      .defaultAnalyzer(analyzerModel)
      .defaultField(indexTextOperatorDefaultFieldModel)
      .indexArrayLengths(true)
      .partialFilterSelector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .fields(new java.util.HashMap<String, String>() { { put("foo", "asc"); } })
      .build();
    assertEquals(jsonIndexDefinitionModel.defaultAnalyzer(), analyzerModel);
    assertEquals(jsonIndexDefinitionModel.defaultField(), indexTextOperatorDefaultFieldModel);
    assertEquals(jsonIndexDefinitionModel.indexArrayLengths(), Boolean.valueOf(true));
    assertEquals(jsonIndexDefinitionModel.partialFilterSelector(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(jsonIndexDefinitionModel.fields(), new java.util.HashMap<String, String>() { { put("foo", "asc"); } });

    String json = TestUtilities.serialize(jsonIndexDefinitionModel);

    JsonIndexDefinition jsonIndexDefinitionModelNew = TestUtilities.deserialize(json, JsonIndexDefinition.class);
    assertTrue(jsonIndexDefinitionModelNew instanceof JsonIndexDefinition);
    assertEquals(jsonIndexDefinitionModelNew.defaultAnalyzer().toString(), analyzerModel.toString());
    assertEquals(jsonIndexDefinitionModelNew.defaultField().toString(), indexTextOperatorDefaultFieldModel.toString());
    assertEquals(jsonIndexDefinitionModelNew.indexArrayLengths(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testJsonIndexDefinitionError() throws Throwable {
    new JsonIndexDefinition.Builder().build();
  }

}