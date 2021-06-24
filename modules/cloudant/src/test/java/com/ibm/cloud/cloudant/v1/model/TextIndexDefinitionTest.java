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
import com.ibm.cloud.cloudant.v1.model.TextIndexDefinition;
import com.ibm.cloud.cloudant.v1.model.TextIndexField;
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
 * Unit test class for the TextIndexDefinition model.
 */
public class TextIndexDefinitionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTextIndexDefinition() throws Throwable {
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

    TextIndexField textIndexFieldModel = new TextIndexField.Builder()
      .name("testString")
      .type("boolean")
      .build();
    assertEquals(textIndexFieldModel.name(), "testString");
    assertEquals(textIndexFieldModel.type(), "boolean");

    TextIndexDefinition textIndexDefinitionModel = new TextIndexDefinition.Builder()
      .defaultAnalyzer(analyzerModel)
      .defaultField(indexTextOperatorDefaultFieldModel)
      .indexArrayLengths(true)
      .partialFilterSelector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .fields(textIndexFieldModel)
      .build();
    assertEquals(textIndexDefinitionModel.defaultAnalyzer(), analyzerModel);
    assertEquals(textIndexDefinitionModel.defaultField(), indexTextOperatorDefaultFieldModel);
    assertEquals(textIndexDefinitionModel.indexArrayLengths(), Boolean.valueOf(true));
    assertEquals(textIndexDefinitionModel.partialFilterSelector(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(textIndexDefinitionModel.fields(), textIndexFieldModel);

    String json = TestUtilities.serialize(textIndexDefinitionModel);

    TextIndexDefinition textIndexDefinitionModelNew = TestUtilities.deserialize(json, TextIndexDefinition.class);
    assertTrue(textIndexDefinitionModelNew instanceof TextIndexDefinition);
    assertEquals(textIndexDefinitionModelNew.defaultAnalyzer().toString(), analyzerModel.toString());
    assertEquals(textIndexDefinitionModelNew.defaultField().toString(), indexTextOperatorDefaultFieldModel.toString());
    assertEquals(textIndexDefinitionModelNew.indexArrayLengths(), Boolean.valueOf(true));
    assertEquals(textIndexDefinitionModelNew.fields().toString(), textIndexFieldModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTextIndexDefinitionError() throws Throwable {
    new TextIndexDefinition.Builder().build();
  }

}