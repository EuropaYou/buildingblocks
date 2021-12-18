# Europa's-Building-Blocks
This mod currently adds cosmetic/decorative versions of blocks that were the BlockEntity which can cause lags.

## What is BlockEntity?
BlockEntity or BlockEntities are the blocks that are actually entity. Any block that interacts with player or the enviroment is the BlockEntity(There are exceptions of course). Block entities store additional information about certain blocks, with the type of information varying by block. Blocks with block entities can be moved by pistons in Bedrock Edition, but not in Java Edition.

Some block entities, or their effects, stop being rendered beyond a hard-coded block limit which is modeled after the radius of a sphere. This limit is not affected by the Render Distance nor the Entity Distance scale in the Video Settings. 

Ex: Furnace, Beehives, beacons and Campfires

## Why does BlockEntity cause lag and FPS drop?
Block entities store additional information about certain blocks, with the type of information varying by block. In some cases, this information is used to create a more complex model, such as the book on an enchanting table. In other cases, it is used to store contents of an object.

Some block entities, or their effects, stop being rendered beyond a hard-coded block limit which is modeled after the radius of a sphere. This limit is not affected by the Render Distance nor the Entity Distance scale in the Video Settings. 

BlockEntity doesn't causing as much lags as other live entities. Depending on how many are there it does cause TPS drop for server side FPS drop for Client side.

# Why Should I download this?
Well I'm not going to say you NEED to download this but if you are an creative mode player and do lots of stuff with BlockEntites I highly suggest to download this.

## List of the Decorative Blocks implemented
- Furnace
- Blast Furnace
- Dispenser *(Not Completed)*
- Bee Nest
- Bee Hive
- Dropper
- Note Block
- Observer
- Smoker
## List of the Decorative Blocks *will* be implemented
- Hopper
- Shulker Box
- Barrel
- Beacon
- Lectern
- Piston
- Jukebox
- Enchanting Table
- Cauldron
