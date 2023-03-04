package com.mavacore369.domain.com.coupling;

/*In Java, coupling refers to the degree to which one class depends on another class. It measures the level of interaction between two or more classes within a system.
The more tightly coupled classes are, the more difficult it is to make changes to one class without affecting the other classes.
In general, high coupling is considered undesirable as it makes the system more complex and harder to maintain. There are several types of coupling in Java:

Content coupling: This occurs when one class modifies the internal implementation of another class.

Common coupling: This occurs when two or more classes share a global variable.

Control coupling: This occurs when one class controls the flow of execution of another class.

Stamp coupling: This occurs when one class passes a large number of parameters to another class.

Data coupling: This occurs when two or more classes share data, but no code is shared between them.

Message coupling: This occurs when two or more classes communicate with each other using messages.

In general, low coupling is desirable as it makes the system easier to maintain, test, and modify.
To achieve low coupling, it is recommended to use design patterns, such as the Model-View-Controller (MVC) pattern, and to follow best practices,
such as the Single Responsibility Principle (SRP), which states that each class should have only one reason to change. By reducing coupling between classes,
 developers can create more flexible, scalable, and maintainable software systems.*/

class ShoppingCartEntry {
    public float price;
    public int quantity;

    public float getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    public ShoppingCartEntry[] items;

    public float getTotalPrice() {
        float totalPrice = 0;
        for (ShoppingCartEntry item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}

class Order {
    private ShoppingCart cart;
    private float salesTax;

    public Order(ShoppingCart cart, float salesTax) {
        this.cart = cart;
        this.salesTax = salesTax;
    }

    public float orderTotalPrice() {
        float cartTotalPrice = 0;
        /*for (int i=0;i<cart.items.length;i++){
            cartTotalPrice += cart.items[i].price * cart.items[i].quantity;
        }
        cartTotalPrice += cartTotalPrice * salesTax;
        return  cartTotalPrice;*/
        return cart.getTotalPrice() * (1.0f + salesTax);
    }
}
