package HW4;


import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "myron04041995";
        try {
            DriverManager.registerDriver(new Driver());
            Connection connectionCar = DriverManager.getConnection(url, username, password);
            Statement statementCar = connectionCar.createStatement();
            PreparedStatement preparedStatementCar = connectionCar.prepareStatement("SELECT * FROM Car WHERE Price>? AND CarYear>?");
            preparedStatementCar.setInt(1, 8000);
            preparedStatementCar.setInt(2, 2000);
            ResultSet resultSetCar = preparedStatementCar.executeQuery();

            List<Car> carList = new LinkedList<>();
            while (resultSetCar.next()) {
                Car car = buildCar(resultSetCar);
                carList.add(car);
            }
            System.out.println(carList);
            System.out.println(carList.size());

            resultSetCar.close();
            statementCar.close();
            connectionCar.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            DriverManager.registerDriver(new Driver());
            Connection connectionProduct = DriverManager.getConnection(url, username, password);
            Statement statementProduct = connectionProduct.createStatement();
            PreparedStatement preparedStatementProduct = connectionProduct.prepareStatement("select * from Product WHERE ProductID  = 2");
            ResultSet resultSetProduct = preparedStatementProduct.executeQuery();

            List<Product> productList = new LinkedList<>();
            while (resultSetProduct.next()) {
                Product product = buildroduct(resultSetProduct);
                productList.add(product);
            }
            System.out.println(productList);
            System.out.println(productList.size());

            resultSetProduct.close();
            statementProduct.close();
            connectionProduct.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            DriverManager.registerDriver(new Driver());
            Connection connectionPerson = DriverManager.getConnection(url, username, password);
            Statement statementPerson = connectionPerson.createStatement();
            PreparedStatement preparedStatementPerson = connectionPerson.prepareStatement("select * from Person WHERE Number LIKE '%5'");
            ResultSet resultSetPerson = preparedStatementPerson.executeQuery();

            List<Person> personList = new LinkedList<>();
            while (resultSetPerson.next()) {
                Person person = buildPerson(resultSetPerson);
                personList.add(person);
            }
            System.out.println(personList);
            System.out.println(personList.size());

            resultSetPerson.close();
            statementPerson.close();
            connectionPerson.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private static Person buildPerson(ResultSet resultSetPerson) throws SQLException {
        Person person = new Person();
        person.setPersonID(resultSetPerson.getInt(1));
        person.setFirstName(resultSetPerson.getString(2));
        person.setLastName(resultSetPerson.getString(3));
        person.setPhoneNumber(resultSetPerson.getInt(4));
        return person;
    }


    private static Car buildCar(ResultSet resultSetCar) throws SQLException {
        Car car = new Car();
        car.setCarName(resultSetCar.getString(1));
        car.setCarModify(resultSetCar.getString(2));
        car.setCarYear(resultSetCar.getInt(3));
        car.setPrice(resultSetCar.getInt(4));
        return car;
    }

    private static Product buildroduct(ResultSet resultSetProduct) throws SQLException {
        Product product = new Product();
        product.setProductID(resultSetProduct.getInt(1));
        product.setNameFruits(resultSetProduct.getString(2));
        product.setPriceFruits(resultSetProduct.getInt(3));
        product.setMade(resultSetProduct.getString(4));
        return product;
    }
}
