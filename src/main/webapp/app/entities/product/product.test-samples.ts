import { IProduct, NewProduct } from './product.model';

export const sampleWithRequiredData: IProduct = {
  id: 77672,
};

export const sampleWithPartialData: IProduct = {
  id: 82518,
};

export const sampleWithFullData: IProduct = {
  id: 96307,
  name: 'collaborative SSL Concrete',
  category: 'deliver',
  company: 'Administrator Health',
};

export const sampleWithNewData: NewProduct = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
