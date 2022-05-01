from typing import List
from uuid import UUID
from fastapi import FastAPI, HTTPException
from models import Product
from models import ProductUpdate

app = FastAPI() 

db: List[Product] = [
    Product(id=UUID("c175095b-7681-47f4-85ec-09f0e7239367"), productName="Arroz", productBrand="Sepé", productPrice=25.00, unitMeasurement="5kg" ),
    Product(id=UUID("068c4e3c-c775-49b8-a306-98e3a27d0e99"), productName="Feijão", productBrand="Camil", productPrice=10.00, unitMeasurement="1kg" )
]

@app.get("/")
async def root():
    return {"Hello": "Mundo"}

@app.get("/api/v1/products")
async def get_products():
    return db

@app.post("/api/v1/products")
async def save_product(product: Product):
    db.append(product)
    return {"id": product.id}

@app.delete("/api/v1/products/{productId}")
async def delete_product(productId: UUID):
    for product in db:
        if product.id == productId:
            db.remove(product)
            return
    raise HTTPException(
        status_code=404,
        detail=f"product with id: {productId} does not exists"
    )

@app.put("/api/v1/products/{productId}")
async def update_product(productId: UUID, productUpdate: ProductUpdate):
    for product in db:
        if product.id == productId:
            if productUpdate.productName is not None:
                product.productName = productUpdate.productName
            if productUpdate.productBrand is not None:
                product.productBrand = productUpdate.productBrand
            if productUpdate.productPrice is not None:
                product.productPrice = productUpdate.productPrice
            if productUpdate.unitMeasurement is not None:
                product.unitMeasurement = productUpdate.unitMeasurement
            return {"id": product.id}
    raise HTTPException(
        status_code=404,
        detail=f"product with id: {productId} does not exists"
    )
        
