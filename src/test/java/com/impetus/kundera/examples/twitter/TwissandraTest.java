/*
 * Copyright 2011 Impetus Infotech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.impetus.kundera.examples.twitter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.impetus.kundera.examples.twitter.query.CassandraQuerySuite;

/**
 * Test case for Cassandra.
 * 
 * @author amresh.singh
 */
public class TwissandraTest extends CassandraQuerySuite
{

    /** The Constant LOG. */
    private static final Log LOG = LogFactory.getLog(TwissandraTest.class);


    @Override
    protected void setUp() throws Exception
    {
        setUpInternal("twissandra");
    }

    /**
     * Test on execute.
     */
    /*public void testOnExecute() throws Exception
    {
       executeTestSuite();
    }*/

    /**
     * Test on execute query.
     */
    
   public void testOnQuery()
    {
        executeQuerySuite();
    }
    

    @Override
    protected void tearDown() throws Exception
    {
        tearDownInternal();
    }

    /**
     * Start cassandra server.
     * 
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     * @throws ConfigurationException
     *             the configuration exception
     */
   /* private static void startCassandraServer() throws IOException, ConfigurationException
    {

        if (!checkIfServerRunning())
        {
            EmbeddedCassandraService cassandra = new EmbeddedCassandraService();
            cassandra.start();
        }
    }*/

    /**
     * Check if server running.
     * 
     * @return true, if successful
     */

   /* public static boolean checkIfServerRunning()
    {
        try
        {
            Socket socket = new Socket("127.0.0.1", 9165);
            return socket.getInetAddress() != null;
        }
        catch (UnknownHostException e)
        {
            return false;
        }
        catch (IOException e)
        {
            return false;
        }
    }*/

    /**
     * Load data.
     * 
     * @throws ConfigurationException
     *             the configuration exception
     * @throws TException
     *             the t exception
     * @throws NotFoundException
     *             the not found exception
     * @throws InvalidRequestException
     *             the invalid request exception
     */
    /*
     * public void loadData() throws
     * org.apache.cassandra.config.ConfigurationException, TException,
     * NotFoundException, InvalidRequestException {
     * 
     * Class<? extends AbstractReplicationStrategy> simple =
     * SimpleStrategy.class; Map<String, String> ret = new HashMap<String,
     * String>(); ret.put("replication_factor", "1"); CfDef user_Def = new
     * CfDef("KunderaExamples", "users");
     * user_Def.setComparator_type("UTF8Type");
     * user_Def.setColumn_type("Super");
     * user_Def.setSubcomparator_type("UTF8Type");
     * user_Def.setDefault_validation_class("UTF8Type"); CfDef preference_Def =
     * new CfDef("KunderaExamples", "preference"); CfDef external_Def = new
     * CfDef("KunderaExamples", "externalLinks"); List<CfDef> cfDefs = new
     * ArrayList<CfDef>(); cfDefs.add(user_Def); cfDefs.add(preference_Def);
     * cfDefs.add(external_Def);
     * 
     * client.send_system_add_keyspace(new KsDef("Examples",
     * simple.getCanonicalName(), cfDefs).setReplication_factor(1));
     * 
     * KSMetaData metadata = new KSMetaData("KunderaExamples", simple, ret,
     * standardCFMD("KunderaExamples", "users", ColumnFamilyType.Super),
     * standardCFMD("KunderaExamples", "preference", ColumnFamilyType.Standard),
     * standardCFMD("KunderaExamples",
     * "externalLinks",ColumnFamilyType.Standard));
     * 
     * 
     * for (CFMetaData cfm : metadata.cfMetaData().values()) {
     * CFMetaData.map(cfm); }
     * 
     * DatabaseDescriptor.setTableDefinition(metadata,
     * DatabaseDescriptor.getDefsVersion());
     * 
     * }
     */

    /**
     * Standard cfmd.
     * 
     * @param ksName
     *            the ks name
     * @param cfName
     *            the cf name
     * @param columnFamilyType
     *            the column family type
     * @return the cF meta data
     */
    /*
     * private static CFMetaData standardCFMD(String ksName, String cfName,
     * ColumnFamilyType columnFamilyType) {
     * 
     * return new CFMetaData(ksName, cfName, columnFamilyType,
     * UTF8Type.instance, null, "colfamily", Double .valueOf("0"),
     * Double.valueOf("0"), Double.valueOf("0"), 0, UTF8Type.instance, 0, 0, 0,
     * 0, 0, Integer .valueOf(0), Double.valueOf("0"), new HashMap<ByteBuffer,
     * ColumnDefinition>()); }
     */

    /**
     * Inits the client.
     */
    /*private void initClient()
    {
        TSocket socket = new TSocket("127.0.0.1", 9165);
        TTransport transport = new TFramedTransport(socket);
        TProtocol protocol = new TBinaryProtocol(transport);
        client = new Cassandra.Client(protocol);

        try
        {
            socket.open();
        }
        catch (TTransportException ttex)
        {

            LOG.error(ttex.getMessage());
        }
        catch (Exception ex)
        {
            LOG.error(ex.getMessage());
        }
    }*/
}
