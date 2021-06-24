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
import com.ibm.cloud.cloudant.v1.model.IndexConfigurationIndexIndexDefinition;
import com.ibm.cloud.cloudant.v1.model.IndexField;
import com.ibm.cloud.cloudant.v1.model.IndexTextOperatorDefaultField;
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
 * Unit test class for the IndexConfigurationIndexIndexDefinition model.
 */
public class IndexConfigurationIndexIndexDefinitionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIndexConfigurationIndexIndexDefinition() throws Throwable {
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

    IndexField indexFieldModel = new IndexField.Builder()
      .name("testString")
      .type("boolean")
      .add("foo", "asc")
      .build();
    assertEquals(indexFieldModel.getName(), "testString");
    assertEquals(indexFieldModel.getType(), "boolean");
    assertEquals(indexFieldModel.get("foo"), "asc");

    IndexConfigurationIndexIndexDefinition indexConfigurationIndexIndexDefinitionModel = new IndexConfigurationIndexIndexDefinition.Builder()
      .defaultAnalyzer(analyzerModel)
      .defaultField(indexTextOperatorDefaultFieldModel)
      .fields(new java.util.ArrayList<IndexField>(java.util.Arrays.asList(indexFieldModel)))
      .indexArrayLengths(true)
      .partialFilterSelector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(indexConfigurationIndexIndexDefinitionModel.defaultAnalyzer(), analyzerModel);
    assertEquals(indexConfigurationIndexIndexDefinitionModel.defaultField(), indexTextOperatorDefaultFieldModel);
    assertEquals(indexConfigurationIndexIndexDefinitionModel.fields(), new java.util.ArrayList<IndexField>(java.util.Arrays.asList(indexFieldModel)));
    assertEquals(indexConfigurationIndexIndexDefinitionModel.indexArrayLengths(), Boolean.valueOf(true));
    assertEquals(indexConfigurationIndexIndexDefinitionModel.partialFilterSelector(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    String json = TestUtilities.serialize(indexConfigurationIndexIndexDefinitionModel);

    IndexConfigurationIndexIndexDefinition indexConfigurationIndexIndexDefinitionModelNew = TestUtilities.deserialize(json, IndexConfigurationIndexIndexDefinition.class);
    assertTrue(indexConfigurationIndexIndexDefinitionModelNew instanceof IndexConfigurationIndexIndexDefinition);
    assertEquals(indexConfigurationIndexIndexDefinitionModelNew.defaultAnalyzer().toString(), analyzerModel.toString());
    assertEquals(indexConfigurationIndexIndexDefinitionModelNew.defaultField().toString(), indexTextOperatorDefaultFieldModel.toString());
    assertEquals(indexConfigurationIndexIndexDefinitionModelNew.indexArrayLengths(), Boolean.valueOf(true));
  }
}