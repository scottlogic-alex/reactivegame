export interface IAsset {
  url: string;
  size: number;
  xAdjust: number;
  yAdjust: number;
}

export type AssetTypes =
  | "Fedora"
  | "Sombrero"
  | "Apple"
  | "Eyes"
  | "Collision"
  | "Crown";

export type AssetsStructure = { [key in AssetTypes]: IAsset };

export const assets: AssetsStructure = {
  Fedora: {
    url: "/assets/img/fedora.png",
    size: 40,
    xAdjust: 20,
    yAdjust: 60
  },
  Sombrero: {
    url: "/assets/img/sombrero.png",
    size: 40,
    xAdjust: 20,
    yAdjust: 60
  },
  Apple: {
    url: "/assets/img/apple.png",
    size: 70,
    xAdjust: 0,
    yAdjust: 0
  },
  Eyes: {
    url: "/assets/img/googlyEyes.png",
    size: 40,
    xAdjust: 20,
    yAdjust: 20
  },
  Collision: {
    url: "/assets/img/explosion.png",
    size: 100,
    xAdjust: 50,
    yAdjust: 50
  },
  Crown: {
    url: "/assets/img/crown2.png",
    size: 40,
    xAdjust: 20,
    yAdjust: 60
  }
};
