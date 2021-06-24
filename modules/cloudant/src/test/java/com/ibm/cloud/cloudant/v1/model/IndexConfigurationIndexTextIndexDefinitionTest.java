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
import com.ibm.cloud.cloudant.v1.model.IndexConfigurationIndexTextIndexDefinition;
import com.ibm.cloud.cloudant.v1.model.IndexTextOperatorDefaultField;
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
 * Unit test class for the IndexConfigurationIndexTextIndexDefinition model.
 */
public class IndexConfigurationIndexTextIndexDefinitionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIndexConfigurationIndexTextIndexDefinition() throws Throwable {
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

    IndexConfigurationIndexTextIndexDefinition indexConfigurationIndexTextIndexDefinitionModel = new IndexConfigurationIndexTextIndexDefinition.Builder()
      .defaultAnalyzer(analyzerModel)
      .defaultField(indexTextOperatorDefaultFieldModel)
      .indexArrayLengths(true)
      .partialFilterSelector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .fields(textIndexFieldModel)
      .build();
    assertEquals(indexConfigurationIndexTextIndexDefinitionModel.defaultAnalyzer(), analyzerModel);
    assertEquals(indexConfigurationIndexTextIndexDefinitionModel.defaultField(), indexTextOperatorDefaultFieldModel);
    assertEquals(indexConfigurationIndexTextIndexDefinitionModel.indexArrayLengths(), Boolean.valueOf(true));
    assertEquals(indexConfigurationIndexTextIndexDefinitionModel.partialFilterSelector(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(indexConfigurationIndexTextIndexDefinitionModel.fields(), textIndexFieldModel);

    String json = TestUtilities.serialize(indexConfigurationIndexTextIndexDefinitionModel);

    IndexConfigurationIndexTextIndexDefinition indexConfigurationIndexTextIndexDefinitionModelNew = TestUtilities.deserialize(json, IndexConfigurationIndexTextIndexDefinition.class);
    assertTrue(indexConfigurationIndexTextIndexDefinitionModelNew instanceof IndexConfigurationIndexTextIndexDefinition);
    assertEquals(indexConfigurationIndexTextIndexDefinitionModelNew.defaultAnalyzer().toString(), analyzerModel.toString());
    assertEquals(indexConfigurationIndexTextIndexDefinitionModelNew.defaultField().toString(), indexTextOperatorDefaultFieldModel.toString());
    assertEquals(indexConfigurationIndexTextIndexDefinitionModelNew.indexArrayLengths(), Boolean.valueOf(true));
    assertEquals(indexConfigurationIndexTextIndexDefinitionModelNew.fields().toString(), textIndexFieldModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testIndexConfigurationIndexTextIndexDefinitionError() throws Throwable {
    new IndexConfigurationIndexTextIndexDefinition.Builder().build();
  }

}