/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import entity.Account;
import entity.Category;
import entity.Order;
import entity.Product;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class DAOTest {
    
    public DAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllProduct method, of class DAO.
     */
    @Test
    public void testGetAllProduct() {
        System.out.println("getAllProduct");
        DAO instance = new DAO();
        List<Product> expResult = null;
        List<Product> result = instance.getAllProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTop6 method, of class DAO.
     */
    @Test
    public void testGetTop6() {
        System.out.println("getTop6");
        DAO instance = new DAO();
        List<Product> expResult = null;
        List<Product> result = instance.getTop6();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCategory method, of class DAO.
     */
    @Test
    public void testGetAllCategory() {
        System.out.println("getAllCategory");
        DAO instance = new DAO();
        List<Category> expResult = null;
        List<Category> result = instance.getAllCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class DAO.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        DAO instance = new DAO();
        List<Product> expResult = null;
        List<Product> result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProByCate method, of class DAO.
     */
    @Test
    public void testGetProByCate() {
        System.out.println("getProByCate");
        String category_id = "";
        DAO instance = new DAO();
        List<Product> expResult = null;
        List<Product> result = instance.getProByCate(category_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProById method, of class DAO.
     */
    @Test
    public void testGetProById() {
        System.out.println("getProById");
        String product_id = "";
        DAO instance = new DAO();
        Product expResult = null;
        Product result = instance.getProById(product_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCateById method, of class DAO.
     */
    @Test
    public void testGetCateById() {
        System.out.println("getCateById");
        int category_id = 0;
        DAO instance = new DAO();
        Category expResult = null;
        Category result = instance.getCateById(category_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSearchByName method, of class DAO.
     */
    @Test
    public void testGetSearchByName() {
        System.out.println("getSearchByName");
        String txtSearch = "";
        DAO instance = new DAO();
        List<Product> expResult = null;
        List<Product> result = instance.getSearchByName(txtSearch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class DAO.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        DAO instance = new DAO();
        Account expResult = null;
        Account result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAccExist method, of class DAO.
     */
    @Test
    public void testCheckAccExist() {
        System.out.println("checkAccExist");
        String username = "";
        DAO instance = new DAO();
        Account expResult = null;
        Account result = instance.checkAccExist(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class DAO.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        String username = "";
        String password = "";
        DAO instance = new DAO();
        instance.register(username, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProduct method, of class DAO.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        String product_id = "";
        DAO instance = new DAO();
        instance.deleteProduct(product_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertProduct method, of class DAO.
     */
    @Test
    public void testInsertProduct() {
        System.out.println("insertProduct");
        String product_name = "";
        String list_price = "";
        String category_name = "";
        String img = "";
        int category_id = 0;
        DAO instance = new DAO();
        instance.insertProduct(product_name, list_price, category_name, img, category_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editProduct method, of class DAO.
     */
    @Test
    public void testEditProduct() {
        System.out.println("editProduct");
        String product_name = "";
        String list_price = "";
        String category_name = "";
        String img = "";
        String product_id = "";
        DAO instance = new DAO();
        instance.editProduct(product_name, list_price, category_name, img, product_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalProduct method, of class DAO.
     */
    @Test
    public void testGetTotalProduct() {
        System.out.println("getTotalProduct");
        DAO instance = new DAO();
        int expResult = 0;
        int result = instance.getTotalProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pageProduct method, of class DAO.
     */
    @Test
    public void testPageProduct() {
        System.out.println("pageProduct");
        int index = 0;
        DAO instance = new DAO();
        List<Product> expResult = null;
        List<Product> result = instance.pageProduct(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrder method, of class DAO.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        int order_id = 0;
        DAO instance = new DAO();
        List<Order> expResult = null;
        List<Order> result = instance.getOrder(order_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeOrder method, of class DAO.
     */
    @Test
    public void testRemoveOrder() {
        System.out.println("removeOrder");
        int id = 0;
        DAO instance = new DAO();
        int expResult = 0;
        int result = instance.removeOrder(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class DAO.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
