package models

case class Product(productId: Int,
                   productType: String,
                   colour: String,
                   availability: Boolean,
                   size: String)

object Product {
  def apply(): List[Product] = List(
    Product(1111,"shirt","white",true,"S"),
    Product(1111,"shirt","black",true,"S"),
    Product(1111,"shirt","red",true,"S"),
    Product(1111,"shirt","green",true,"S"),
    Product(1111,"shirt","purple",true,"S"),
    Product(1111,"shirt","grey",true,"S")
    )
}
