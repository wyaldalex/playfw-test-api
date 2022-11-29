package models

class ProductService {
  def findAll()   = {
    Product.apply()
  }
}

object ProductService extends ProductService