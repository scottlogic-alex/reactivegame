export interface IAsset {
  url: string;
  height: number;
  width: number;
  xAdjust: number;
  yAdjust: number;
}

export interface IHat {
  id: string;
  consumable: false;
  inUse: boolean;
  name: string;
  type: "Hat";
}

export type AssetTypes =
  | "fedora"
  | "sombrero"
  | "Apple"
  | "Eyes"
  | "Collision"
  | "Crown"
  | "clear";

export type AssetsStructure = { [key in AssetTypes]: IAsset };

export const assets: AssetsStructure = {
  fedora: {
    url: "/assets/img/fedora2.png",
    width: 70,
    height: 40,
    xAdjust: 33,
    yAdjust: 45
  },
  sombrero: {
    url: "/assets/img/sombrero.png",
    width: 70,
    height: 60,
    xAdjust: 35,
    yAdjust: 60
  },
  Apple: {
    url: "/assets/img/apple.png",
    width: 70,
    height: 70,
    xAdjust: 0,
    yAdjust: 0
  },
  Eyes: {
    url: "/assets/img/googlyEyes.png",
    width: 40,
    height: 40,
    xAdjust: 20,
    yAdjust: 20
  },
  Collision: {
    url: "/assets/img/explosion.png",
    width: 100,
    height: 100,
    xAdjust: 50,
    yAdjust: 50
  },
  Crown: {
    url: "/assets/img/crown2.png",
    width: 40,
    height: 40,
    xAdjust: 20,
    yAdjust: 60
  },
  clear: {
    url: "/assets/img/clear.png",
    width: 50,
    height: 50,
    xAdjust: 25,
    yAdjust: 25
  }
};
