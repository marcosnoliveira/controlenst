/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.Cargo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablosouza
 */
public class JDBCCargoTest {
    
    private JDBCCargo instance = null;
    
    public JDBCCargoTest() {
        instance = JDBCCargo.getInstance();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    
        /**
     * Test of save method, of class JDBCCargo.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Cargo cargo = new Cargo();
        cargo.setDescricao("Teste Cargo");
        JDBCCargo instance = JDBCCargo.getInstance();
        instance.save(cargo);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
            /**
     * Test of save method, of class JDBCCargo.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Cargo cargo = new Cargo();
        cargo.setId(1);
        cargo.setDescricao("testUpdate");
        instance.save(cargo);
        
    }

    /**
     * Test of delete method, of class JDBCCargo.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Cargo cargo = new Cargo();
        cargo.setId(2);
        instance.delete(cargo);
        
    }

    /**
     * Test of getAll method, of class JDBCCargo.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List result = instance.getAll();
        assertNotNull(result);
        
    }

    /**
     * Test of getByPrimaryKey method, of class JDBCCargo.
     */
    @Test
    public void testGetByPrimaryKey() {
        
        Integer id = 1;
        Cargo result = instance.getByPrimaryKey(id);
        assertNotNull(result);
        
    }

    
}
