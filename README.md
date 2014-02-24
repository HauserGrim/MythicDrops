# MythicDrops
MythicDrops is a Bukkit plugin that brings an RPG-like system of drops to Minecraft. Items can
have unique names, lore, and enchantments added randomly to them through a tier system.

## Installation
Use Maven. Add the MythicDrops repository and dependency entries to your `pom.xml`.

```xml
<repository>
  <id>mythicdrops-mvn-repo</id>
  <url>https://raw.github.com/Nunnery/MythicDrops/mvn-repo/</url>
  <snapshots>
    <enabled>true</enabled>
    <updatePolicy>always</updatePolicy>
  </snapshots>
</repository>

<dependency>
  <groupId>net.nunnerycode.bukkit</groupId>
  <artifactId>MythicDrops</artifactId>
  <version>3.0.0-RC-2</version>
</dependency>
```