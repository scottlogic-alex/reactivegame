export interface IUser {
  name: string;
  id: string;
  colour: string;
  host: string;
  items: Array<IItem>;
}

export interface IItem {
  id: string;
  consumable: boolean;
  name: string;
  type: string;
  inUse: boolean;
}
