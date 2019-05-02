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
  | "cowboy"
  | "mortarboard"
  | "ranger"
  | "santa"
  | "snapback"
  | "spacehelmet"
  | "sunhat"
  | "viking"
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
  cowboy: {
    url: "/assets/img/cowboy.png",
    width: 70,
    height: 70,
    xAdjust: 35,
    yAdjust: 60
  },
  mortarboard: {
    url: "/assets/img/mortarboard.png",
    width: 70,
    height: 50,
    xAdjust: 35,
    yAdjust: 45
  },
  ranger: {
    url: "/assets/img/ranger.png",
    width: 70,
    height: 40,
    xAdjust: 34,
    yAdjust: 45
  },
  santa: {
    url: "/assets/img/santa.png",
    width: 70,
    height: 70,
    xAdjust: 45,
    yAdjust: 65
  },
  snapback: {
    url: "/assets/img/snapback.png",
    width: 60,
    height: 50,
    xAdjust: 30,
    yAdjust: 50
  },
  spacehelmet: {
    url: "/assets/img/space_helmet.png",
    width: 70,
    height: 60,
    xAdjust: 35,
    yAdjust: 30
  },
  sunhat: {
    url: "/assets/img/sunhat.png",
    width: 90,
    height: 70,
    xAdjust: 43,
    yAdjust: 60
  },
  viking: {
    url: "/assets/img/viking.png",
    width: 70,
    height: 60,
    xAdjust: 40,
    yAdjust: 65
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
