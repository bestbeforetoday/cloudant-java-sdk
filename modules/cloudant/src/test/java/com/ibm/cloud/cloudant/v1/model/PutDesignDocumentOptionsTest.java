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
import com.ibm.cloud.cloudant.v1.model.AnalyzerConfiguration;
import com.ibm.cloud.cloudant.v1.model.Attachment;
import com.ibm.cloud.cloudant.v1.model.DesignDocument;
import com.ibm.cloud.cloudant.v1.model.DesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.DesignDocumentViewsMapReduce;
import com.ibm.cloud.cloudant.v1.model.DocumentRevisionStatus;
import com.ibm.cloud.cloudant.v1.model.GeoIndexDefinition;
import com.ibm.cloud.cloudant.v1.model.PutDesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.Revisions;
import com.ibm.cloud.cloudant.v1.model.SearchIndexDefinition;
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
 * Unit test class for the PutDesignDocumentOptions model.
 */
public class PutDesignDocumentOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutDesignDocumentOptions() throws Throwable {
    Attachment attachmentModel = new Attachment.Builder()
      .contentType("testString")
      .data(TestUtilities.createMockByteArray("This is a mock byte array value."))
      .digest("testString")
      .encodedLength(Long.valueOf("0"))
      .encoding("testString")
      .follows(true)
      .length(Long.valueOf("0"))
      .revpos(Long.valueOf("1"))
      .stub(true)
      .build();
    assertEquals(attachmentModel.contentType(), "testString");
    assertEquals(attachmentModel.data(), TestUtilities.createMockByteArray("This is a mock byte array value."));
    assertEquals(attachmentModel.digest(), "testString");
    assertEquals(attachmentModel.encodedLength(), Long.valueOf("0"));
    assertEquals(attachmentModel.encoding(), "testString");
    assertEquals(attachmentModel.follows(), Boolean.valueOf(true));
    assertEquals(attachmentModel.length(), Long.valueOf("0"));
    assertEquals(attachmentModel.revpos(), Long.valueOf("1"));
    assertEquals(attachmentModel.stub(), Boolean.valueOf(true));

    Revisions revisionsModel = new Revisions.Builder()
      .ids(new ArrayList<String>(Arrays.asList("testString")))
      .start(Long.valueOf("1"))
      .build();
    assertEquals(revisionsModel.ids(), new ArrayList<String>(Arrays.asList("testString")));
    assertEquals(revisionsModel.start(), Long.valueOf("1"));

    DocumentRevisionStatus documentRevisionStatusModel = new DocumentRevisionStatus.Builder()
      .rev("testString")
      .status("available")
      .build();
    assertEquals(documentRevisionStatusModel.rev(), "testString");
    assertEquals(documentRevisionStatusModel.status(), "available");

    Analyzer analyzerModel = new Analyzer.Builder()
      .name("classic")
      .stopwords(new ArrayList<String>(Arrays.asList("testString")))
      .build();
    assertEquals(analyzerModel.name(), "classic");
    assertEquals(analyzerModel.stopwords(), new ArrayList<String>(Arrays.asList("testString")));

    AnalyzerConfiguration analyzerConfigurationModel = new AnalyzerConfiguration.Builder()
      .name("classic")
      .stopwords(new ArrayList<String>(Arrays.asList("testString")))
      .fields(new HashMap<String, Analyzer>() { { put("foo", analyzerModel); } })
      .build();
    assertEquals(analyzerConfigurationModel.name(), "classic");
    assertEquals(analyzerConfigurationModel.stopwords(), new ArrayList<String>(Arrays.asList("testString")));
    assertEquals(analyzerConfigurationModel.fields(), new HashMap<String, Analyzer>() { { put("foo", analyzerModel); } });

    SearchIndexDefinition searchIndexDefinitionModel = new SearchIndexDefinition.Builder()
      .analyzer(analyzerConfigurationModel)
      .index("testString")
      .build();
    assertEquals(searchIndexDefinitionModel.analyzer(), analyzerConfigurationModel);
    assertEquals(searchIndexDefinitionModel.index(), "testString");

    DesignDocumentOptions designDocumentOptionsModel = new DesignDocumentOptions.Builder()
      .partitioned(true)
      .build();
    assertEquals(designDocumentOptionsModel.partitioned(), Boolean.valueOf(true));

    DesignDocumentViewsMapReduce designDocumentViewsMapReduceModel = new DesignDocumentViewsMapReduce.Builder()
      .map("testString")
      .reduce("testString")
      .build();
    assertEquals(designDocumentViewsMapReduceModel.map(), "testString");
    assertEquals(designDocumentViewsMapReduceModel.reduce(), "testString");

    GeoIndexDefinition geoIndexDefinitionModel = new GeoIndexDefinition.Builder()
      .index("testString")
      .build();
    assertEquals(geoIndexDefinitionModel.index(), "testString");

    DesignDocument designDocumentModel = new DesignDocument.Builder()
      .attachments(new HashMap<String, Attachment>() { { put("foo", attachmentModel); } })
      .conflicts(new ArrayList<String>(Arrays.asList("testString")))
      .deleted(true)
      .deletedConflicts(new ArrayList<String>(Arrays.asList("testString")))
      .id("testString")
      .localSeq("testString")
      .rev("testString")
      .revisions(revisionsModel)
      .revsInfo(new ArrayList<DocumentRevisionStatus>(Arrays.asList(documentRevisionStatusModel)))
      .autoupdate(true)
      .filters(new HashMap<String, String>() { { put("foo", "testString"); } })
      .indexes(new HashMap<String, SearchIndexDefinition>() { { put("foo", searchIndexDefinitionModel); } })
      .language("testString")
      .options(designDocumentOptionsModel)
      .updates(new HashMap<String, String>() { { put("foo", "testString"); } })
      .validateDocUpdate(new HashMap<String, String>() { { put("foo", "testString"); } })
      .views(new HashMap<String, DesignDocumentViewsMapReduce>() { { put("foo", designDocumentViewsMapReduceModel); } })
      .stIndexes(new HashMap<String, GeoIndexDefinition>() { { put("foo", geoIndexDefinitionModel); } })
      .add("foo", "testString")
      .build();
    assertEquals(designDocumentModel.getAttachments(), new HashMap<String, Attachment>() { { put("foo", attachmentModel); } });
    assertEquals(designDocumentModel.getConflicts(), new ArrayList<String>(Arrays.asList("testString")));
    assertEquals(designDocumentModel.isDeleted(), Boolean.valueOf(true));
    assertEquals(designDocumentModel.getDeletedConflicts(), new ArrayList<String>(Arrays.asList("testString")));
    assertEquals(designDocumentModel.getId(), "testString");
    assertEquals(designDocumentModel.getLocalSeq(), "testString");
    assertEquals(designDocumentModel.getRev(), "testString");
    assertEquals(designDocumentModel.getRevisions(), revisionsModel);
    assertEquals(designDocumentModel.getRevsInfo(), new ArrayList<DocumentRevisionStatus>(Arrays.asList(documentRevisionStatusModel)));
    assertEquals(designDocumentModel.isAutoupdate(), Boolean.valueOf(true));
    assertEquals(designDocumentModel.getFilters(), new HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(designDocumentModel.getIndexes(), new HashMap<String, SearchIndexDefinition>() { { put("foo", searchIndexDefinitionModel); } });
    assertEquals(designDocumentModel.getLanguage(), "testString");
    assertEquals(designDocumentModel.getOptions(), designDocumentOptionsModel);
    assertEquals(designDocumentModel.getUpdates(), new HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(designDocumentModel.getValidateDocUpdate(), new HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(designDocumentModel.getViews(), new HashMap<String, DesignDocumentViewsMapReduce>() { { put("foo", designDocumentViewsMapReduceModel); } });
    assertEquals(designDocumentModel.getStIndexes(), new HashMap<String, GeoIndexDefinition>() { { put("foo", geoIndexDefinitionModel); } });
    assertEquals(designDocumentModel.get("foo"), "testString");

    PutDesignDocumentOptions putDesignDocumentOptionsModel = new PutDesignDocumentOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .designDocument(designDocumentModel)
      .ifMatch("testString")
      .batch("ok")
      .newEdits(true)
      .rev("testString")
      .build();
    assertEquals(putDesignDocumentOptionsModel.db(), "testString");
    assertEquals(putDesignDocumentOptionsModel.ddoc(), "testString");
    assertEquals(putDesignDocumentOptionsModel.designDocument(), designDocumentModel);
    assertEquals(putDesignDocumentOptionsModel.ifMatch(), "testString");
    assertEquals(putDesignDocumentOptionsModel.batch(), "ok");
    assertEquals(putDesignDocumentOptionsModel.newEdits(), Boolean.valueOf(true));
    assertEquals(putDesignDocumentOptionsModel.rev(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutDesignDocumentOptionsError() throws Throwable {
    new PutDesignDocumentOptions.Builder().build();
  }

}
