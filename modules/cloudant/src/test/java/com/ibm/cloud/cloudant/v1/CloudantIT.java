/*
 * (C) Copyright IBM Corp. 2022.
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

package com.ibm.cloud.cloudant.v1;

import com.ibm.cloud.cloudant.v1.model.ActiveTask;
import com.ibm.cloud.cloudant.v1.model.ActivityTrackerEvents;
import com.ibm.cloud.cloudant.v1.model.AllDocsQueriesResult;
import com.ibm.cloud.cloudant.v1.model.AllDocsQuery;
import com.ibm.cloud.cloudant.v1.model.AllDocsResult;
import com.ibm.cloud.cloudant.v1.model.Analyzer;
import com.ibm.cloud.cloudant.v1.model.AnalyzerConfiguration;
import com.ibm.cloud.cloudant.v1.model.ApiKeysResult;
import com.ibm.cloud.cloudant.v1.model.Attachment;
import com.ibm.cloud.cloudant.v1.model.BulkDocs;
import com.ibm.cloud.cloudant.v1.model.BulkGetQueryDocument;
import com.ibm.cloud.cloudant.v1.model.BulkGetResult;
import com.ibm.cloud.cloudant.v1.model.BulkGetResultDocument;
import com.ibm.cloud.cloudant.v1.model.BulkGetResultItem;
import com.ibm.cloud.cloudant.v1.model.CapacityThroughputInformation;
import com.ibm.cloud.cloudant.v1.model.CapacityThroughputInformationCurrent;
import com.ibm.cloud.cloudant.v1.model.CapacityThroughputInformationTarget;
import com.ibm.cloud.cloudant.v1.model.Change;
import com.ibm.cloud.cloudant.v1.model.ChangesResult;
import com.ibm.cloud.cloudant.v1.model.ChangesResultItem;
import com.ibm.cloud.cloudant.v1.model.ContentInformationSizes;
import com.ibm.cloud.cloudant.v1.model.CorsInformation;
import com.ibm.cloud.cloudant.v1.model.CurrentThroughputInformation;
import com.ibm.cloud.cloudant.v1.model.CurrentThroughputInformationThroughput;
import com.ibm.cloud.cloudant.v1.model.DatabaseInformation;
import com.ibm.cloud.cloudant.v1.model.DatabaseInformationCluster;
import com.ibm.cloud.cloudant.v1.model.DatabaseInformationProps;
import com.ibm.cloud.cloudant.v1.model.DbEvent;
import com.ibm.cloud.cloudant.v1.model.DbUpdates;
import com.ibm.cloud.cloudant.v1.model.DbsInfoResult;
import com.ibm.cloud.cloudant.v1.model.DeleteAttachmentOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteDatabaseOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteDesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteIndexOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteLocalDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.DeleteReplicationDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.DesignDocument;
import com.ibm.cloud.cloudant.v1.model.DesignDocumentInformation;
import com.ibm.cloud.cloudant.v1.model.DesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.DesignDocumentViewIndex;
import com.ibm.cloud.cloudant.v1.model.DesignDocumentViewsMapReduce;
import com.ibm.cloud.cloudant.v1.model.DocsResultRow;
import com.ibm.cloud.cloudant.v1.model.DocsResultRowValue;
import com.ibm.cloud.cloudant.v1.model.Document;
import com.ibm.cloud.cloudant.v1.model.DocumentResult;
import com.ibm.cloud.cloudant.v1.model.DocumentRevisionStatus;
import com.ibm.cloud.cloudant.v1.model.DocumentShardInfo;
import com.ibm.cloud.cloudant.v1.model.ExecutionStats;
import com.ibm.cloud.cloudant.v1.model.ExplainResult;
import com.ibm.cloud.cloudant.v1.model.ExplainResultRange;
import com.ibm.cloud.cloudant.v1.model.FindResult;
import com.ibm.cloud.cloudant.v1.model.GeoIndexDefinition;
import com.ibm.cloud.cloudant.v1.model.GeoIndexInformation;
import com.ibm.cloud.cloudant.v1.model.GeoIndexStats;
import com.ibm.cloud.cloudant.v1.model.GeoJsonFeature;
import com.ibm.cloud.cloudant.v1.model.GeoJsonGeometry;
import com.ibm.cloud.cloudant.v1.model.GeoJsonGeometryCollection;
import com.ibm.cloud.cloudant.v1.model.GeoJsonGeometryObject;
import com.ibm.cloud.cloudant.v1.model.GeoResult;
import com.ibm.cloud.cloudant.v1.model.GeoResultRow;
import com.ibm.cloud.cloudant.v1.model.GetActiveTasksOptions;
import com.ibm.cloud.cloudant.v1.model.GetActivityTrackerEventsOptions;
import com.ibm.cloud.cloudant.v1.model.GetAllDbsOptions;
import com.ibm.cloud.cloudant.v1.model.GetAttachmentOptions;
import com.ibm.cloud.cloudant.v1.model.GetCapacityThroughputInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetCorsInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetCurrentThroughputInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetDatabaseInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetDbUpdatesOptions;
import com.ibm.cloud.cloudant.v1.model.GetDesignDocumentInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetDesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.GetDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.GetDocumentShardsInfoOptions;
import com.ibm.cloud.cloudant.v1.model.GetGeoIndexInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetGeoOptions;
import com.ibm.cloud.cloudant.v1.model.GetIndexesInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetLocalDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.GetMembershipInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetPartitionInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetReplicationDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.GetSchedulerDocsOptions;
import com.ibm.cloud.cloudant.v1.model.GetSchedulerDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.GetSchedulerJobOptions;
import com.ibm.cloud.cloudant.v1.model.GetSchedulerJobsOptions;
import com.ibm.cloud.cloudant.v1.model.GetSearchInfoOptions;
import com.ibm.cloud.cloudant.v1.model.GetSecurityOptions;
import com.ibm.cloud.cloudant.v1.model.GetServerInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetSessionInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetShardsInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetUpInformationOptions;
import com.ibm.cloud.cloudant.v1.model.GetUuidsOptions;
import com.ibm.cloud.cloudant.v1.model.HeadAttachmentOptions;
import com.ibm.cloud.cloudant.v1.model.HeadDatabaseOptions;
import com.ibm.cloud.cloudant.v1.model.HeadDesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.HeadDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.HeadLocalDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.HeadReplicationDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.HeadSchedulerDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.HeadSchedulerJobOptions;
import com.ibm.cloud.cloudant.v1.model.HeadUpInformationOptions;
import com.ibm.cloud.cloudant.v1.model.IndexDefinition;
import com.ibm.cloud.cloudant.v1.model.IndexField;
import com.ibm.cloud.cloudant.v1.model.IndexInformation;
import com.ibm.cloud.cloudant.v1.model.IndexResult;
import com.ibm.cloud.cloudant.v1.model.IndexTextOperatorDefaultField;
import com.ibm.cloud.cloudant.v1.model.IndexesInformation;
import com.ibm.cloud.cloudant.v1.model.MembershipInformation;
import com.ibm.cloud.cloudant.v1.model.Ok;
import com.ibm.cloud.cloudant.v1.model.PartitionInformation;
import com.ibm.cloud.cloudant.v1.model.PartitionInformationIndexes;
import com.ibm.cloud.cloudant.v1.model.PartitionInformationIndexesIndexes;
import com.ibm.cloud.cloudant.v1.model.PartitionInformationSizes;
import com.ibm.cloud.cloudant.v1.model.PostActivityTrackerEventsOptions;
import com.ibm.cloud.cloudant.v1.model.PostAllDocsOptions;
import com.ibm.cloud.cloudant.v1.model.PostAllDocsQueriesOptions;
import com.ibm.cloud.cloudant.v1.model.PostApiKeysOptions;
import com.ibm.cloud.cloudant.v1.model.PostBulkDocsOptions;
import com.ibm.cloud.cloudant.v1.model.PostBulkGetOptions;
import com.ibm.cloud.cloudant.v1.model.PostChangesOptions;
import com.ibm.cloud.cloudant.v1.model.PostDbsInfoOptions;
import com.ibm.cloud.cloudant.v1.model.PostDesignDocsOptions;
import com.ibm.cloud.cloudant.v1.model.PostDesignDocsQueriesOptions;
import com.ibm.cloud.cloudant.v1.model.PostDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.PostExplainOptions;
import com.ibm.cloud.cloudant.v1.model.PostFindOptions;
import com.ibm.cloud.cloudant.v1.model.PostGeoCleanupOptions;
import com.ibm.cloud.cloudant.v1.model.PostIndexOptions;
import com.ibm.cloud.cloudant.v1.model.PostPartitionAllDocsOptions;
import com.ibm.cloud.cloudant.v1.model.PostPartitionFindOptions;
import com.ibm.cloud.cloudant.v1.model.PostPartitionSearchOptions;
import com.ibm.cloud.cloudant.v1.model.PostPartitionViewOptions;
import com.ibm.cloud.cloudant.v1.model.PostRevsDiffOptions;
import com.ibm.cloud.cloudant.v1.model.PostSearchAnalyzeOptions;
import com.ibm.cloud.cloudant.v1.model.PostSearchOptions;
import com.ibm.cloud.cloudant.v1.model.PostViewOptions;
import com.ibm.cloud.cloudant.v1.model.PostViewQueriesOptions;
import com.ibm.cloud.cloudant.v1.model.PutAttachmentOptions;
import com.ibm.cloud.cloudant.v1.model.PutCapacityThroughputConfigurationOptions;
import com.ibm.cloud.cloudant.v1.model.PutCloudantSecurityConfigurationOptions;
import com.ibm.cloud.cloudant.v1.model.PutCorsConfigurationOptions;
import com.ibm.cloud.cloudant.v1.model.PutDatabaseOptions;
import com.ibm.cloud.cloudant.v1.model.PutDesignDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.PutDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.PutLocalDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.PutReplicationDocumentOptions;
import com.ibm.cloud.cloudant.v1.model.PutSecurityOptions;
import com.ibm.cloud.cloudant.v1.model.ReplicationCreateTargetParameters;
import com.ibm.cloud.cloudant.v1.model.ReplicationDatabase;
import com.ibm.cloud.cloudant.v1.model.ReplicationDatabaseAuth;
import com.ibm.cloud.cloudant.v1.model.ReplicationDatabaseAuthBasic;
import com.ibm.cloud.cloudant.v1.model.ReplicationDatabaseAuthIam;
import com.ibm.cloud.cloudant.v1.model.ReplicationDocument;
import com.ibm.cloud.cloudant.v1.model.Revisions;
import com.ibm.cloud.cloudant.v1.model.RevsDiff;
import com.ibm.cloud.cloudant.v1.model.SchedulerDocsResult;
import com.ibm.cloud.cloudant.v1.model.SchedulerDocument;
import com.ibm.cloud.cloudant.v1.model.SchedulerInfo;
import com.ibm.cloud.cloudant.v1.model.SchedulerJob;
import com.ibm.cloud.cloudant.v1.model.SchedulerJobEvent;
import com.ibm.cloud.cloudant.v1.model.SchedulerJobsResult;
import com.ibm.cloud.cloudant.v1.model.SearchAnalyzeResult;
import com.ibm.cloud.cloudant.v1.model.SearchIndexDefinition;
import com.ibm.cloud.cloudant.v1.model.SearchIndexInfo;
import com.ibm.cloud.cloudant.v1.model.SearchInfoResult;
import com.ibm.cloud.cloudant.v1.model.SearchResult;
import com.ibm.cloud.cloudant.v1.model.SearchResultProperties;
import com.ibm.cloud.cloudant.v1.model.SearchResultRow;
import com.ibm.cloud.cloudant.v1.model.Security;
import com.ibm.cloud.cloudant.v1.model.SecurityObject;
import com.ibm.cloud.cloudant.v1.model.ServerInformation;
import com.ibm.cloud.cloudant.v1.model.ServerVendor;
import com.ibm.cloud.cloudant.v1.model.SessionAuthentication;
import com.ibm.cloud.cloudant.v1.model.SessionInformation;
import com.ibm.cloud.cloudant.v1.model.ShardsInformation;
import com.ibm.cloud.cloudant.v1.model.ThroughputInformation;
import com.ibm.cloud.cloudant.v1.model.UpInformation;
import com.ibm.cloud.cloudant.v1.model.UserContext;
import com.ibm.cloud.cloudant.v1.model.UuidsResult;
import com.ibm.cloud.cloudant.v1.model.ViewQueriesResult;
import com.ibm.cloud.cloudant.v1.model.ViewQuery;
import com.ibm.cloud.cloudant.v1.model.ViewResult;
import com.ibm.cloud.cloudant.v1.model.ViewResultRow;
import com.ibm.cloud.cloudant.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.cloudant.SdkIntegrationTestBase;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the Cloudant service.
 */
public class CloudantIT extends SdkIntegrationTestBase {
  public Cloudant service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../cloudant_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Cloudant.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Cloudant.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testGetServerInformation() throws Exception {
    try {
      GetServerInformationOptions getServerInformationOptions = new GetServerInformationOptions();

      // Invoke operation
      Response<ServerInformation> response = service.getServerInformation(getServerInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServerInformation serverInformationResult = response.getResult();

      assertNotNull(serverInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMembershipInformation() throws Exception {
    try {
      GetMembershipInformationOptions getMembershipInformationOptions = new GetMembershipInformationOptions();

      // Invoke operation
      Response<MembershipInformation> response = service.getMembershipInformation(getMembershipInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MembershipInformation membershipInformationResult = response.getResult();

      assertNotNull(membershipInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetUuids() throws Exception {
    try {
      GetUuidsOptions getUuidsOptions = new GetUuidsOptions.Builder()
      .build();

      // Invoke operation
      Response<UuidsResult> response = service.getUuids(getUuidsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UuidsResult uuidsResultResult = response.getResult();

      assertNotNull(uuidsResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetCapacityThroughputInformation() throws Exception {
    try {
      GetCapacityThroughputInformationOptions getCapacityThroughputInformationOptions = new GetCapacityThroughputInformationOptions();

      // Invoke operation
      Response<CapacityThroughputInformation> response = service.getCapacityThroughputInformation(getCapacityThroughputInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CapacityThroughputInformation capacityThroughputInformationResult = response.getResult();

      assertNotNull(capacityThroughputInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutCapacityThroughputConfiguration() throws Exception {
    try {
      PutCapacityThroughputConfigurationOptions putCapacityThroughputConfigurationOptions = new PutCapacityThroughputConfigurationOptions.Builder()
      .blocks(Long.valueOf("0"))
      .build();

      // Invoke operation
      Response<CapacityThroughputInformation> response = service.putCapacityThroughputConfiguration(putCapacityThroughputConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CapacityThroughputInformation capacityThroughputInformationResult = response.getResult();

      assertNotNull(capacityThroughputInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 413
      // 415
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDbUpdates() throws Exception {
    try {
      GetDbUpdatesOptions getDbUpdatesOptions = new GetDbUpdatesOptions.Builder()
      .build();

      // Invoke operation
      Response<DbUpdates> response = service.getDbUpdates(getDbUpdatesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DbUpdates dbUpdatesResult = response.getResult();

      assertNotNull(dbUpdatesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostChanges() throws Exception {
    try {
      PostChangesOptions postChangesOptions = new PostChangesOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<ChangesResult> response = service.postChanges(postChangesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ChangesResult changesResultResult = response.getResult();

      assertNotNull(changesResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostChangesAsStream() throws Exception {
    try {
      PostChangesOptions postChangesOptions = new PostChangesOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.postChangesAsStream(postChangesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testHeadDatabase() throws Exception {
    try {
      HeadDatabaseOptions headDatabaseOptions = new HeadDatabaseOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.headDatabase(headDatabaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetAllDbs() throws Exception {
    try {
      GetAllDbsOptions getAllDbsOptions = new GetAllDbsOptions.Builder()
      .build();

      // Invoke operation
      Response<List<String>> response = service.getAllDbs(getAllDbsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      List<String> resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostDbsInfo() throws Exception {
    try {
      PostDbsInfoOptions postDbsInfoOptions = new PostDbsInfoOptions.Builder()
      .keys(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      // Invoke operation
      Response<List<DbsInfoResult>> response = service.postDbsInfo(postDbsInfoOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      List<DbsInfoResult> listDbsInfoResultResult = response.getResult();

      assertNotNull(listDbsInfoResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDatabaseInformation() throws Exception {
    try {
      GetDatabaseInformationOptions getDatabaseInformationOptions = new GetDatabaseInformationOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<DatabaseInformation> response = service.getDatabaseInformation(getDatabaseInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DatabaseInformation databaseInformationResult = response.getResult();

      assertNotNull(databaseInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutDatabase() throws Exception {
    try {
      PutDatabaseOptions putDatabaseOptions = new PutDatabaseOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<Ok> response = service.putDatabase(putDatabaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Ok okResult = response.getResult();

      assertNotNull(okResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testHeadDocument() throws Exception {
    try {
      HeadDocumentOptions headDocumentOptions = new HeadDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.headDocument(headDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostDocument() throws Exception {
    try {
      Attachment attachmentModel = new Attachment.Builder()
      .build();

      Revisions revisionsModel = new Revisions.Builder()
      .ids(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .start(Long.valueOf("1"))
      .build();

      DocumentRevisionStatus documentRevisionStatusModel = new DocumentRevisionStatus.Builder()
      .rev("testString")
      .status("available")
      .build();

      Document documentModel = new Document.Builder()
      .build();

      PostDocumentOptions postDocumentOptions = new PostDocumentOptions.Builder()
      .db("testString")
      .document(documentModel)
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.postDocument(postDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 409
      // 412
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostAllDocs() throws Exception {
    try {
      PostAllDocsOptions postAllDocsOptions = new PostAllDocsOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<AllDocsResult> response = service.postAllDocs(postAllDocsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AllDocsResult allDocsResultResult = response.getResult();

      assertNotNull(allDocsResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostAllDocsAsStream() throws Exception {
    try {
      PostAllDocsOptions postAllDocsOptions = new PostAllDocsOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.postAllDocsAsStream(postAllDocsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostAllDocsQueries() throws Exception {
    try {
      AllDocsQuery allDocsQueryModel = new AllDocsQuery.Builder()
      .build();

      PostAllDocsQueriesOptions postAllDocsQueriesOptions = new PostAllDocsQueriesOptions.Builder()
      .db("testString")
      .queries(new java.util.ArrayList<AllDocsQuery>(java.util.Arrays.asList(allDocsQueryModel)))
      .build();

      // Invoke operation
      Response<AllDocsQueriesResult> response = service.postAllDocsQueries(postAllDocsQueriesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AllDocsQueriesResult allDocsQueriesResultResult = response.getResult();

      assertNotNull(allDocsQueriesResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostAllDocsQueriesAsStream() throws Exception {
    try {
      AllDocsQuery allDocsQueryModel = new AllDocsQuery.Builder()
      .build();

      PostAllDocsQueriesOptions postAllDocsQueriesOptions = new PostAllDocsQueriesOptions.Builder()
      .db("testString")
      .queries(new java.util.ArrayList<AllDocsQuery>(java.util.Arrays.asList(allDocsQueryModel)))
      .build();

      // Invoke operation
      Response<InputStream> response = service.postAllDocsQueriesAsStream(postAllDocsQueriesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostBulkDocs() throws Exception {
    try {
      Attachment attachmentModel = new Attachment.Builder()
      .build();

      Revisions revisionsModel = new Revisions.Builder()
      .ids(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .start(Long.valueOf("1"))
      .build();

      DocumentRevisionStatus documentRevisionStatusModel = new DocumentRevisionStatus.Builder()
      .rev("testString")
      .status("available")
      .build();

      Document documentModel = new Document.Builder()
      .build();

      BulkDocs bulkDocsModel = new BulkDocs.Builder()
      .docs(new java.util.ArrayList<Document>(java.util.Arrays.asList(documentModel)))
      .build();

      PostBulkDocsOptions postBulkDocsOptions = new PostBulkDocsOptions.Builder()
      .db("testString")
      .bulkDocs(bulkDocsModel)
      .build();

      // Invoke operation
      Response<List<DocumentResult>> response = service.postBulkDocs(postBulkDocsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      List<DocumentResult> listDocumentResultResult = response.getResult();

      assertNotNull(listDocumentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostBulkGet() throws Exception {
    try {
      BulkGetQueryDocument bulkGetQueryDocumentModel = new BulkGetQueryDocument.Builder()
      .attsSince(new java.util.ArrayList<String>(java.util.Arrays.asList("1-99b02e08da151943c2dcb40090160bb8")))
      .id("testString")
      .build();

      PostBulkGetOptions postBulkGetOptions = new PostBulkGetOptions.Builder()
      .db("testString")
      .docs(new java.util.ArrayList<BulkGetQueryDocument>(java.util.Arrays.asList(bulkGetQueryDocumentModel)))
      .build();

      // Invoke operation
      Response<BulkGetResult> response = service.postBulkGet(postBulkGetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BulkGetResult bulkGetResultResult = response.getResult();

      assertNotNull(bulkGetResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostBulkGetAsMixed() throws Exception {
    try {
      BulkGetQueryDocument bulkGetQueryDocumentModel = new BulkGetQueryDocument.Builder()
      .attsSince(new java.util.ArrayList<String>(java.util.Arrays.asList("1-99b02e08da151943c2dcb40090160bb8")))
      .id("testString")
      .build();

      PostBulkGetOptions postBulkGetOptions = new PostBulkGetOptions.Builder()
      .db("testString")
      .docs(new java.util.ArrayList<BulkGetQueryDocument>(java.util.Arrays.asList(bulkGetQueryDocumentModel)))
      .build();

      // Invoke operation
      Response<InputStream> response = service.postBulkGetAsMixed(postBulkGetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostBulkGetAsRelated() throws Exception {
    try {
      BulkGetQueryDocument bulkGetQueryDocumentModel = new BulkGetQueryDocument.Builder()
      .attsSince(new java.util.ArrayList<String>(java.util.Arrays.asList("1-99b02e08da151943c2dcb40090160bb8")))
      .id("testString")
      .build();

      PostBulkGetOptions postBulkGetOptions = new PostBulkGetOptions.Builder()
      .db("testString")
      .docs(new java.util.ArrayList<BulkGetQueryDocument>(java.util.Arrays.asList(bulkGetQueryDocumentModel)))
      .build();

      // Invoke operation
      Response<InputStream> response = service.postBulkGetAsRelated(postBulkGetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostBulkGetAsStream() throws Exception {
    try {
      BulkGetQueryDocument bulkGetQueryDocumentModel = new BulkGetQueryDocument.Builder()
      .attsSince(new java.util.ArrayList<String>(java.util.Arrays.asList("1-99b02e08da151943c2dcb40090160bb8")))
      .id("testString")
      .build();

      PostBulkGetOptions postBulkGetOptions = new PostBulkGetOptions.Builder()
      .db("testString")
      .docs(new java.util.ArrayList<BulkGetQueryDocument>(java.util.Arrays.asList(bulkGetQueryDocumentModel)))
      .build();

      // Invoke operation
      Response<InputStream> response = service.postBulkGetAsStream(postBulkGetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDocument() throws Exception {
    try {
      GetDocumentOptions getDocumentOptions = new GetDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .build();

      // Invoke operation
      Response<Document> response = service.getDocument(getDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Document documentResult = response.getResult();

      assertNotNull(documentResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDocumentAsMixed() throws Exception {
    try {
      GetDocumentOptions getDocumentOptions = new GetDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.getDocumentAsMixed(getDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDocumentAsRelated() throws Exception {
    try {
      GetDocumentOptions getDocumentOptions = new GetDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.getDocumentAsRelated(getDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDocumentAsStream() throws Exception {
    try {
      GetDocumentOptions getDocumentOptions = new GetDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.getDocumentAsStream(getDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutDocument() throws Exception {
    try {
      Attachment attachmentModel = new Attachment.Builder()
      .build();

      Revisions revisionsModel = new Revisions.Builder()
      .ids(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .start(Long.valueOf("1"))
      .build();

      DocumentRevisionStatus documentRevisionStatusModel = new DocumentRevisionStatus.Builder()
      .rev("testString")
      .status("available")
      .build();

      Document documentModel = new Document.Builder()
      .build();

      PutDocumentOptions putDocumentOptions = new PutDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .document(documentModel)
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.putDocument(putDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 409
      // 412
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testHeadDesignDocument() throws Exception {
    try {
      HeadDesignDocumentOptions headDesignDocumentOptions = new HeadDesignDocumentOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.headDesignDocument(headDesignDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDesignDocument() throws Exception {
    try {
      GetDesignDocumentOptions getDesignDocumentOptions = new GetDesignDocumentOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .build();

      // Invoke operation
      Response<DesignDocument> response = service.getDesignDocument(getDesignDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DesignDocument designDocumentResult = response.getResult();

      assertNotNull(designDocumentResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutDesignDocument() throws Exception {
    try {
      Attachment attachmentModel = new Attachment.Builder()
      .build();

      Revisions revisionsModel = new Revisions.Builder()
      .ids(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .start(Long.valueOf("1"))
      .build();

      DocumentRevisionStatus documentRevisionStatusModel = new DocumentRevisionStatus.Builder()
      .rev("testString")
      .status("available")
      .build();

      Analyzer analyzerModel = new Analyzer.Builder()
      .build();

      AnalyzerConfiguration analyzerConfigurationModel = new AnalyzerConfiguration.Builder()
      .build();

      SearchIndexDefinition searchIndexDefinitionModel = new SearchIndexDefinition.Builder()
      .index("testString")
      .build();

      DesignDocumentOptions designDocumentOptionsModel = new DesignDocumentOptions.Builder()
      .build();

      DesignDocumentViewsMapReduce designDocumentViewsMapReduceModel = new DesignDocumentViewsMapReduce.Builder()
      .map("testString")
      .build();

      GeoIndexDefinition geoIndexDefinitionModel = new GeoIndexDefinition.Builder()
      .index("testString")
      .build();

      DesignDocument designDocumentModel = new DesignDocument.Builder()
      .build();

      PutDesignDocumentOptions putDesignDocumentOptions = new PutDesignDocumentOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .designDocument(designDocumentModel)
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.putDesignDocument(putDesignDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 409
      // 412
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDesignDocumentInformation() throws Exception {
    try {
      GetDesignDocumentInformationOptions getDesignDocumentInformationOptions = new GetDesignDocumentInformationOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .build();

      // Invoke operation
      Response<DesignDocumentInformation> response = service.getDesignDocumentInformation(getDesignDocumentInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DesignDocumentInformation designDocumentInformationResult = response.getResult();

      assertNotNull(designDocumentInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostDesignDocs() throws Exception {
    try {
      PostDesignDocsOptions postDesignDocsOptions = new PostDesignDocsOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<AllDocsResult> response = service.postDesignDocs(postDesignDocsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AllDocsResult allDocsResultResult = response.getResult();

      assertNotNull(allDocsResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostDesignDocsQueries() throws Exception {
    try {
      AllDocsQuery allDocsQueryModel = new AllDocsQuery.Builder()
      .build();

      PostDesignDocsQueriesOptions postDesignDocsQueriesOptions = new PostDesignDocsQueriesOptions.Builder()
      .db("testString")
      .queries(new java.util.ArrayList<AllDocsQuery>(java.util.Arrays.asList(allDocsQueryModel)))
      .build();

      // Invoke operation
      Response<AllDocsQueriesResult> response = service.postDesignDocsQueries(postDesignDocsQueriesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AllDocsQueriesResult allDocsQueriesResultResult = response.getResult();

      assertNotNull(allDocsQueriesResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostView() throws Exception {
    try {
      PostViewOptions postViewOptions = new PostViewOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .view("testString")
      .build();

      // Invoke operation
      Response<ViewResult> response = service.postView(postViewOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ViewResult viewResultResult = response.getResult();

      assertNotNull(viewResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostViewAsStream() throws Exception {
    try {
      PostViewOptions postViewOptions = new PostViewOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .view("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.postViewAsStream(postViewOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostViewQueries() throws Exception {
    try {
      ViewQuery viewQueryModel = new ViewQuery.Builder()
      .build();

      PostViewQueriesOptions postViewQueriesOptions = new PostViewQueriesOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .view("testString")
      .queries(new java.util.ArrayList<ViewQuery>(java.util.Arrays.asList(viewQueryModel)))
      .build();

      // Invoke operation
      Response<ViewQueriesResult> response = service.postViewQueries(postViewQueriesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ViewQueriesResult viewQueriesResultResult = response.getResult();

      assertNotNull(viewQueriesResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostViewQueriesAsStream() throws Exception {
    try {
      ViewQuery viewQueryModel = new ViewQuery.Builder()
      .build();

      PostViewQueriesOptions postViewQueriesOptions = new PostViewQueriesOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .view("testString")
      .queries(new java.util.ArrayList<ViewQuery>(java.util.Arrays.asList(viewQueryModel)))
      .build();

      // Invoke operation
      Response<InputStream> response = service.postViewQueriesAsStream(postViewQueriesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetPartitionInformation() throws Exception {
    try {
      GetPartitionInformationOptions getPartitionInformationOptions = new GetPartitionInformationOptions.Builder()
      .db("testString")
      .partitionKey("testString")
      .build();

      // Invoke operation
      Response<PartitionInformation> response = service.getPartitionInformation(getPartitionInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PartitionInformation partitionInformationResult = response.getResult();

      assertNotNull(partitionInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostPartitionAllDocs() throws Exception {
    try {
      PostPartitionAllDocsOptions postPartitionAllDocsOptions = new PostPartitionAllDocsOptions.Builder()
      .db("testString")
      .partitionKey("testString")
      .build();

      // Invoke operation
      Response<AllDocsResult> response = service.postPartitionAllDocs(postPartitionAllDocsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AllDocsResult allDocsResultResult = response.getResult();

      assertNotNull(allDocsResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostPartitionAllDocsAsStream() throws Exception {
    try {
      PostPartitionAllDocsOptions postPartitionAllDocsOptions = new PostPartitionAllDocsOptions.Builder()
      .db("testString")
      .partitionKey("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.postPartitionAllDocsAsStream(postPartitionAllDocsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostPartitionSearch() throws Exception {
    try {
      PostPartitionSearchOptions postPartitionSearchOptions = new PostPartitionSearchOptions.Builder()
      .db("testString")
      .partitionKey("testString")
      .ddoc("testString")
      .index("testString")
      .query("testString")
      .build();

      // Invoke operation
      Response<SearchResult> response = service.postPartitionSearch(postPartitionSearchOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SearchResult searchResultResult = response.getResult();

      assertNotNull(searchResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostPartitionSearchAsStream() throws Exception {
    try {
      PostPartitionSearchOptions postPartitionSearchOptions = new PostPartitionSearchOptions.Builder()
      .db("testString")
      .partitionKey("testString")
      .ddoc("testString")
      .index("testString")
      .query("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.postPartitionSearchAsStream(postPartitionSearchOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostPartitionView() throws Exception {
    try {
      PostPartitionViewOptions postPartitionViewOptions = new PostPartitionViewOptions.Builder()
      .db("testString")
      .partitionKey("testString")
      .ddoc("testString")
      .view("testString")
      .build();

      // Invoke operation
      Response<ViewResult> response = service.postPartitionView(postPartitionViewOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ViewResult viewResultResult = response.getResult();

      assertNotNull(viewResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostPartitionViewAsStream() throws Exception {
    try {
      PostPartitionViewOptions postPartitionViewOptions = new PostPartitionViewOptions.Builder()
      .db("testString")
      .partitionKey("testString")
      .ddoc("testString")
      .view("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.postPartitionViewAsStream(postPartitionViewOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostPartitionFind() throws Exception {
    try {
      PostPartitionFindOptions postPartitionFindOptions = new PostPartitionFindOptions.Builder()
      .db("testString")
      .partitionKey("testString")
      .selector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

      // Invoke operation
      Response<FindResult> response = service.postPartitionFind(postPartitionFindOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FindResult findResultResult = response.getResult();

      assertNotNull(findResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostPartitionFindAsStream() throws Exception {
    try {
      PostPartitionFindOptions postPartitionFindOptions = new PostPartitionFindOptions.Builder()
      .db("testString")
      .partitionKey("testString")
      .selector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

      // Invoke operation
      Response<InputStream> response = service.postPartitionFindAsStream(postPartitionFindOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostExplain() throws Exception {
    try {
      PostExplainOptions postExplainOptions = new PostExplainOptions.Builder()
      .db("testString")
      .selector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

      // Invoke operation
      Response<ExplainResult> response = service.postExplain(postExplainOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ExplainResult explainResultResult = response.getResult();

      assertNotNull(explainResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostFind() throws Exception {
    try {
      PostFindOptions postFindOptions = new PostFindOptions.Builder()
      .db("testString")
      .selector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

      // Invoke operation
      Response<FindResult> response = service.postFind(postFindOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      FindResult findResultResult = response.getResult();

      assertNotNull(findResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostFindAsStream() throws Exception {
    try {
      PostFindOptions postFindOptions = new PostFindOptions.Builder()
      .db("testString")
      .selector(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

      // Invoke operation
      Response<InputStream> response = service.postFindAsStream(postFindOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetIndexesInformation() throws Exception {
    try {
      GetIndexesInformationOptions getIndexesInformationOptions = new GetIndexesInformationOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<IndexesInformation> response = service.getIndexesInformation(getIndexesInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IndexesInformation indexesInformationResult = response.getResult();

      assertNotNull(indexesInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostIndex() throws Exception {
    try {
      Analyzer analyzerModel = new Analyzer.Builder()
      .build();

      IndexTextOperatorDefaultField indexTextOperatorDefaultFieldModel = new IndexTextOperatorDefaultField.Builder()
      .build();

      IndexField indexFieldModel = new IndexField.Builder()
      .build();

      IndexDefinition indexDefinitionModel = new IndexDefinition.Builder()
      .build();

      PostIndexOptions postIndexOptions = new PostIndexOptions.Builder()
      .db("testString")
      .index(indexDefinitionModel)
      .build();

      // Invoke operation
      Response<IndexResult> response = service.postIndex(postIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IndexResult indexResultResult = response.getResult();

      assertNotNull(indexResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostSearchAnalyze() throws Exception {
    try {
      PostSearchAnalyzeOptions postSearchAnalyzeOptions = new PostSearchAnalyzeOptions.Builder()
      .analyzer("arabic")
      .text("testString")
      .build();

      // Invoke operation
      Response<SearchAnalyzeResult> response = service.postSearchAnalyze(postSearchAnalyzeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SearchAnalyzeResult searchAnalyzeResultResult = response.getResult();

      assertNotNull(searchAnalyzeResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostSearch() throws Exception {
    try {
      PostSearchOptions postSearchOptions = new PostSearchOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .index("testString")
      .query("testString")
      .build();

      // Invoke operation
      Response<SearchResult> response = service.postSearch(postSearchOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SearchResult searchResultResult = response.getResult();

      assertNotNull(searchResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostSearchAsStream() throws Exception {
    try {
      PostSearchOptions postSearchOptions = new PostSearchOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .index("testString")
      .query("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.postSearchAsStream(postSearchOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSearchInfo() throws Exception {
    try {
      GetSearchInfoOptions getSearchInfoOptions = new GetSearchInfoOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .index("testString")
      .build();

      // Invoke operation
      Response<SearchInfoResult> response = service.getSearchInfo(getSearchInfoOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SearchInfoResult searchInfoResultResult = response.getResult();

      assertNotNull(searchInfoResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetGeo() throws Exception {
    try {
      GetGeoOptions getGeoOptions = new GetGeoOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .index("testString")
      .build();

      // Invoke operation
      Response<GeoResult> response = service.getGeo(getGeoOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GeoResult geoResultResult = response.getResult();

      assertNotNull(geoResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetGeoAsStream() throws Exception {
    try {
      GetGeoOptions getGeoOptions = new GetGeoOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .index("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.getGeoAsStream(getGeoOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostGeoCleanup() throws Exception {
    try {
      PostGeoCleanupOptions postGeoCleanupOptions = new PostGeoCleanupOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<Ok> response = service.postGeoCleanup(postGeoCleanupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      Ok okResult = response.getResult();

      assertNotNull(okResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 413
      // 415
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetGeoIndexInformation() throws Exception {
    try {
      GetGeoIndexInformationOptions getGeoIndexInformationOptions = new GetGeoIndexInformationOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .index("testString")
      .build();

      // Invoke operation
      Response<GeoIndexInformation> response = service.getGeoIndexInformation(getGeoIndexInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GeoIndexInformation geoIndexInformationResult = response.getResult();

      assertNotNull(geoIndexInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testHeadReplicationDocument() throws Exception {
    try {
      HeadReplicationDocumentOptions headReplicationDocumentOptions = new HeadReplicationDocumentOptions.Builder()
      .docId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.headReplicationDocument(headReplicationDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testHeadSchedulerDocument() throws Exception {
    try {
      HeadSchedulerDocumentOptions headSchedulerDocumentOptions = new HeadSchedulerDocumentOptions.Builder()
      .docId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.headSchedulerDocument(headSchedulerDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testHeadSchedulerJob() throws Exception {
    try {
      HeadSchedulerJobOptions headSchedulerJobOptions = new HeadSchedulerJobOptions.Builder()
      .jobId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.headSchedulerJob(headSchedulerJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetReplicationDocument() throws Exception {
    try {
      GetReplicationDocumentOptions getReplicationDocumentOptions = new GetReplicationDocumentOptions.Builder()
      .docId("testString")
      .build();

      // Invoke operation
      Response<ReplicationDocument> response = service.getReplicationDocument(getReplicationDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReplicationDocument replicationDocumentResult = response.getResult();

      assertNotNull(replicationDocumentResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutReplicationDocument() throws Exception {
    try {
      Attachment attachmentModel = new Attachment.Builder()
      .build();

      Revisions revisionsModel = new Revisions.Builder()
      .ids(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .start(Long.valueOf("1"))
      .build();

      DocumentRevisionStatus documentRevisionStatusModel = new DocumentRevisionStatus.Builder()
      .rev("testString")
      .status("available")
      .build();

      ReplicationCreateTargetParameters replicationCreateTargetParametersModel = new ReplicationCreateTargetParameters.Builder()
      .build();

      ReplicationDatabaseAuthBasic replicationDatabaseAuthBasicModel = new ReplicationDatabaseAuthBasic.Builder()
      .password("testString")
      .username("testString")
      .build();

      ReplicationDatabaseAuthIam replicationDatabaseAuthIamModel = new ReplicationDatabaseAuthIam.Builder()
      .apiKey("testString")
      .build();

      ReplicationDatabaseAuth replicationDatabaseAuthModel = new ReplicationDatabaseAuth.Builder()
      .build();

      ReplicationDatabase replicationDatabaseModel = new ReplicationDatabase.Builder()
      .url("testString")
      .build();

      UserContext userContextModel = new UserContext.Builder()
      .name("testString")
      .roles(new java.util.ArrayList<String>(java.util.Arrays.asList("_reader")))
      .build();

      ReplicationDocument replicationDocumentModel = new ReplicationDocument.Builder()
      .source(replicationDatabaseModel)
      .target(replicationDatabaseModel)
      .build();

      PutReplicationDocumentOptions putReplicationDocumentOptions = new PutReplicationDocumentOptions.Builder()
      .docId("testString")
      .replicationDocument(replicationDocumentModel)
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.putReplicationDocument(putReplicationDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 409
      // 412
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSchedulerDocs() throws Exception {
    try {
      GetSchedulerDocsOptions getSchedulerDocsOptions = new GetSchedulerDocsOptions.Builder()
      .build();

      // Invoke operation
      Response<SchedulerDocsResult> response = service.getSchedulerDocs(getSchedulerDocsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SchedulerDocsResult schedulerDocsResultResult = response.getResult();

      assertNotNull(schedulerDocsResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSchedulerDocument() throws Exception {
    try {
      GetSchedulerDocumentOptions getSchedulerDocumentOptions = new GetSchedulerDocumentOptions.Builder()
      .docId("testString")
      .build();

      // Invoke operation
      Response<SchedulerDocument> response = service.getSchedulerDocument(getSchedulerDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SchedulerDocument schedulerDocumentResult = response.getResult();

      assertNotNull(schedulerDocumentResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSchedulerJobs() throws Exception {
    try {
      GetSchedulerJobsOptions getSchedulerJobsOptions = new GetSchedulerJobsOptions.Builder()
      .build();

      // Invoke operation
      Response<SchedulerJobsResult> response = service.getSchedulerJobs(getSchedulerJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SchedulerJobsResult schedulerJobsResultResult = response.getResult();

      assertNotNull(schedulerJobsResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSchedulerJob() throws Exception {
    try {
      GetSchedulerJobOptions getSchedulerJobOptions = new GetSchedulerJobOptions.Builder()
      .jobId("testString")
      .build();

      // Invoke operation
      Response<SchedulerJob> response = service.getSchedulerJob(getSchedulerJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SchedulerJob schedulerJobResult = response.getResult();

      assertNotNull(schedulerJobResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSessionInformation() throws Exception {
    try {
      GetSessionInformationOptions getSessionInformationOptions = new GetSessionInformationOptions();

      // Invoke operation
      Response<SessionInformation> response = service.getSessionInformation(getSessionInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SessionInformation sessionInformationResult = response.getResult();

      assertNotNull(sessionInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSecurity() throws Exception {
    try {
      GetSecurityOptions getSecurityOptions = new GetSecurityOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<Security> response = service.getSecurity(getSecurityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Security securityResult = response.getResult();

      assertNotNull(securityResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutSecurity() throws Exception {
    try {
      SecurityObject securityObjectModel = new SecurityObject.Builder()
      .build();

      PutSecurityOptions putSecurityOptions = new PutSecurityOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<Ok> response = service.putSecurity(putSecurityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Ok okResult = response.getResult();

      assertNotNull(okResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostApiKeys() throws Exception {
    try {
      PostApiKeysOptions postApiKeysOptions = new PostApiKeysOptions();

      // Invoke operation
      Response<ApiKeysResult> response = service.postApiKeys(postApiKeysOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ApiKeysResult apiKeysResultResult = response.getResult();

      assertNotNull(apiKeysResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 413
      // 415
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutCloudantSecurityConfiguration() throws Exception {
    try {
      SecurityObject securityObjectModel = new SecurityObject.Builder()
      .build();

      PutCloudantSecurityConfigurationOptions putCloudantSecurityConfigurationOptions = new PutCloudantSecurityConfigurationOptions.Builder()
      .db("testString")
      .cloudant(new java.util.HashMap<String, List<String>>() { { put("foo", new java.util.ArrayList<String>(java.util.Arrays.asList("_reader"))); } })
      .build();

      // Invoke operation
      Response<Ok> response = service.putCloudantSecurityConfiguration(putCloudantSecurityConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Ok okResult = response.getResult();

      assertNotNull(okResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 413
      // 415
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetCorsInformation() throws Exception {
    try {
      GetCorsInformationOptions getCorsInformationOptions = new GetCorsInformationOptions();

      // Invoke operation
      Response<CorsInformation> response = service.getCorsInformation(getCorsInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CorsInformation corsInformationResult = response.getResult();

      assertNotNull(corsInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutCorsConfiguration() throws Exception {
    try {
      PutCorsConfigurationOptions putCorsConfigurationOptions = new PutCorsConfigurationOptions.Builder()
      .origins(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      // Invoke operation
      Response<Ok> response = service.putCorsConfiguration(putCorsConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Ok okResult = response.getResult();

      assertNotNull(okResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 413
      // 415
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testHeadAttachment() throws Exception {
    try {
      HeadAttachmentOptions headAttachmentOptions = new HeadAttachmentOptions.Builder()
      .db("testString")
      .docId("testString")
      .attachmentName("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.headAttachment(headAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 416
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetAttachment() throws Exception {
    try {
      GetAttachmentOptions getAttachmentOptions = new GetAttachmentOptions.Builder()
      .db("testString")
      .docId("testString")
      .attachmentName("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.getAttachment(getAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 416
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutAttachment() throws Exception {
    try {
      PutAttachmentOptions putAttachmentOptions = new PutAttachmentOptions.Builder()
      .db("testString")
      .docId("testString")
      .attachmentName("testString")
      .attachment(TestUtilities.createMockStream("This is a mock file."))
      .contentType("application/octet-stream")
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.putAttachment(putAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 409
      // 412
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testHeadLocalDocument() throws Exception {
    try {
      HeadLocalDocumentOptions headLocalDocumentOptions = new HeadLocalDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.headLocalDocument(headLocalDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetLocalDocument() throws Exception {
    try {
      GetLocalDocumentOptions getLocalDocumentOptions = new GetLocalDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .build();

      // Invoke operation
      Response<Document> response = service.getLocalDocument(getLocalDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Document documentResult = response.getResult();

      assertNotNull(documentResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutLocalDocument() throws Exception {
    try {
      Attachment attachmentModel = new Attachment.Builder()
      .build();

      Revisions revisionsModel = new Revisions.Builder()
      .ids(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .start(Long.valueOf("1"))
      .build();

      DocumentRevisionStatus documentRevisionStatusModel = new DocumentRevisionStatus.Builder()
      .rev("testString")
      .status("available")
      .build();

      Document documentModel = new Document.Builder()
      .build();

      PutLocalDocumentOptions putLocalDocumentOptions = new PutLocalDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .document(documentModel)
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.putLocalDocument(putLocalDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostRevsDiff() throws Exception {
    try {
      PostRevsDiffOptions postRevsDiffOptions = new PostRevsDiffOptions.Builder()
      .db("testString")
      .documentRevisions(new java.util.HashMap<String, List<String>>() { { put("foo", new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))); } })
      .build();

      // Invoke operation
      Response<Map<String, RevsDiff>> response = service.postRevsDiff(postRevsDiffOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, RevsDiff> mapStringRevsDiffResult = response.getResult();

      assertNotNull(mapStringRevsDiffResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 413
      // 415
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetShardsInformation() throws Exception {
    try {
      GetShardsInformationOptions getShardsInformationOptions = new GetShardsInformationOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<ShardsInformation> response = service.getShardsInformation(getShardsInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ShardsInformation shardsInformationResult = response.getResult();

      assertNotNull(shardsInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDocumentShardsInfo() throws Exception {
    try {
      GetDocumentShardsInfoOptions getDocumentShardsInfoOptions = new GetDocumentShardsInfoOptions.Builder()
      .db("testString")
      .docId("testString")
      .build();

      // Invoke operation
      Response<DocumentShardInfo> response = service.getDocumentShardsInfo(getDocumentShardsInfoOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DocumentShardInfo documentShardInfoResult = response.getResult();

      assertNotNull(documentShardInfoResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testHeadUpInformation() throws Exception {
    try {
      HeadUpInformationOptions headUpInformationOptions = new HeadUpInformationOptions();

      // Invoke operation
      Response<Void> response = service.headUpInformation(headUpInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetActiveTasks() throws Exception {
    try {
      GetActiveTasksOptions getActiveTasksOptions = new GetActiveTasksOptions();

      // Invoke operation
      Response<List<ActiveTask>> response = service.getActiveTasks(getActiveTasksOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      List<ActiveTask> listActiveTaskResult = response.getResult();

      assertNotNull(listActiveTaskResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetUpInformation() throws Exception {
    try {
      GetUpInformationOptions getUpInformationOptions = new GetUpInformationOptions();

      // Invoke operation
      Response<UpInformation> response = service.getUpInformation(getUpInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpInformation upInformationResult = response.getResult();

      assertNotNull(upInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetActivityTrackerEvents() throws Exception {
    try {
      GetActivityTrackerEventsOptions getActivityTrackerEventsOptions = new GetActivityTrackerEventsOptions();

      // Invoke operation
      Response<ActivityTrackerEvents> response = service.getActivityTrackerEvents(getActivityTrackerEventsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ActivityTrackerEvents activityTrackerEventsResult = response.getResult();

      assertNotNull(activityTrackerEventsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPostActivityTrackerEvents() throws Exception {
    try {
      PostActivityTrackerEventsOptions postActivityTrackerEventsOptions = new PostActivityTrackerEventsOptions.Builder()
      .types(new java.util.ArrayList<String>(java.util.Arrays.asList("management")))
      .build();

      // Invoke operation
      Response<Ok> response = service.postActivityTrackerEvents(postActivityTrackerEventsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Ok okResult = response.getResult();

      assertNotNull(okResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 413
      // 415
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetCurrentThroughputInformation() throws Exception {
    try {
      GetCurrentThroughputInformationOptions getCurrentThroughputInformationOptions = new GetCurrentThroughputInformationOptions();

      // Invoke operation
      Response<CurrentThroughputInformation> response = service.getCurrentThroughputInformation(getCurrentThroughputInformationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CurrentThroughputInformation currentThroughputInformationResult = response.getResult();

      assertNotNull(currentThroughputInformationResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteReplicationDocument() throws Exception {
    try {
      DeleteReplicationDocumentOptions deleteReplicationDocumentOptions = new DeleteReplicationDocumentOptions.Builder()
      .docId("testString")
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.deleteReplicationDocument(deleteReplicationDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 409
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteLocalDocument() throws Exception {
    try {
      DeleteLocalDocumentOptions deleteLocalDocumentOptions = new DeleteLocalDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.deleteLocalDocument(deleteLocalDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteIndex() throws Exception {
    try {
      DeleteIndexOptions deleteIndexOptions = new DeleteIndexOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .type("json")
      .index("testString")
      .build();

      // Invoke operation
      Response<Ok> response = service.deleteIndex(deleteIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Ok okResult = response.getResult();

      assertNotNull(okResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteDocument() throws Exception {
    try {
      DeleteDocumentOptions deleteDocumentOptions = new DeleteDocumentOptions.Builder()
      .db("testString")
      .docId("testString")
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.deleteDocument(deleteDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 409
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteDesignDocument() throws Exception {
    try {
      DeleteDesignDocumentOptions deleteDesignDocumentOptions = new DeleteDesignDocumentOptions.Builder()
      .db("testString")
      .ddoc("testString")
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.deleteDesignDocument(deleteDesignDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 409
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteDatabase() throws Exception {
    try {
      DeleteDatabaseOptions deleteDatabaseOptions = new DeleteDatabaseOptions.Builder()
      .db("testString")
      .build();

      // Invoke operation
      Response<Ok> response = service.deleteDatabase(deleteDatabaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Ok okResult = response.getResult();

      assertNotNull(okResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteAttachment() throws Exception {
    try {
      DeleteAttachmentOptions deleteAttachmentOptions = new DeleteAttachmentOptions.Builder()
      .db("testString")
      .docId("testString")
      .attachmentName("testString")
      .build();

      // Invoke operation
      Response<DocumentResult> response = service.deleteAttachment(deleteAttachmentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DocumentResult documentResultResult = response.getResult();

      assertNotNull(documentResultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 409
      // 412
      // 500
      // 402
      // 408
      // 410
      // 429
      // 502
      // 503
      // 504
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
