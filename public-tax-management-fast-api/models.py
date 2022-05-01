from typing import Optional
from uuid import UUID, uuid4
from pydantic import BaseModel
from decimal import Decimal


class Product(BaseModel):
    id: Optional[UUID] = uuid4()
    productName: str
    productBrand: str
    productPrice: Decimal
    unitMeasurement: str

class ProductUpdate(BaseModel):
    productName: Optional[str]
    productBrand: Optional[str]
    productPrice: Optional[Decimal]
    unitMeasurement: Optional[str]


