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
import com.ibm.cloud.cloudant.v1.model.IndexDefinitionText;
import com.ibm.cloud.cloudant.v1.model.IndexFieldText;
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
 * Unit test class for the IndexDefinitionText model.
 */
public class IndexDefinitionTextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIndexDefinitionText() throws Throwable {
    Analyzer analyzerModel = new Analyzer.Builder()
      .name("classic")
      .stopwords(new ArrayList<String>(Arrays.asList("testString")))
      .build();
    assertEquals(analyzerModel.name(), "classic");
    assertEquals(analyzerModel.stopwords(), new ArrayList<String>(Arrays.asList("testString")));

    IndexTextOperatorDefaultField indexTextOperatorDefaultFieldModel = new IndexTextOperatorDefaultField.Builder()
      .analyzer(analyzerModel)
      .enabled(true)
      .build();
    assertEquals(indexTextOperatorDefaultFieldModel.analyzer(), analyzerModel);
    assertEquals(indexTextOperatorDefaultFieldModel.enabled(), Boolean.valueOf(true));

    IndexFieldText indexFieldTextModel = new IndexFieldText.Builder()
      .name("testString")
      .type("boolean")
      .build();
    assertEquals(indexFieldTextModel.name(), "testString");
    assertEquals(indexFieldTextModel.type(), "boolean");

    IndexDefinitionText indexDefinitionTextModel = new IndexDefinitionText.Builder()
      .defaultAnalyzer(analyzerModel)
      .defaultField(indexTextOperatorDefaultFieldModel)
      .indexArrayLengths(true)
      .partialFilterSelector(new HashMap<String, Object>() { { put("foo", "testString"); } })
      .fields(new ArrayList<IndexFieldText>(Arrays.asList(indexFieldTextModel)))
      .build();
    assertEquals(indexDefinitionTextModel.defaultAnalyzer(), analyzerModel);
    assertEquals(indexDefinitionTextModel.defaultField(), indexTextOperatorDefaultFieldModel);
    assertEquals(indexDefinitionTextModel.indexArrayLengths(), Boolean.valueOf(true));
    assertEquals(indexDefinitionTextModel.partialFilterSelector(), new HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(indexDefinitionTextModel.fields(), new ArrayList<IndexFieldText>(Arrays.asList(indexFieldTextModel)));

    String json = TestUtilities.serialize(indexDefinitionTextModel);

    IndexDefinitionText indexDefinitionTextModelNew = TestUtilities.deserialize(json, IndexDefinitionText.class);
    assertTrue(indexDefinitionTextModelNew instanceof IndexDefinitionText);
    assertEquals(indexDefinitionTextModelNew.defaultAnalyzer().toString(), analyzerModel.toString());
    assertEquals(indexDefinitionTextModelNew.defaultField().toString(), indexTextOperatorDefaultFieldModel.toString());
    assertEquals(indexDefinitionTextModelNew.indexArrayLengths(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testIndexDefinitionTextError() throws Throwable {
    new IndexDefinitionText.Builder().build();
  }

}
