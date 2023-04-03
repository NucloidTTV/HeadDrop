/*     */ package me.baks.hd;
/*     */ 
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.block.Skull;
/*     */ import org.bukkit.entity.EntityType;
/*     */ import org.bukkit.entity.LivingEntity;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.BlockBreakEvent;
/*     */ import org.bukkit.event.entity.EntityDeathEvent;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ 
/*     */ public class PluginListener implements Listener {
/*  17 */   static Main plugin = Main.plugin;
/*     */ 
/*     */   
/*     */   @EventHandler
/*     */   public void onBlockBreak(BlockBreakEvent event) {
/*  22 */     Block block = event.getBlock();
/*  23 */     Location loc = block.getLocation();
/*     */     
/*  25 */     if (event.isCancelled())
/*  26 */       return;  if (block.getType() == Material.SKULL) {
/*  27 */       Skull skull = (Skull)block.getState();
/*  28 */       String owner = skull.getOwner();
/*     */       
/*  30 */       if (owner != null) {
/*  31 */         String str; switch ((str = owner).hashCode()) { case -1672325082: if (!str.equals("MHF_Wolf")) {
/*     */               break;
/*     */             }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  52 */             event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.wolf()); return;
/*     */           case -1427947163: if (!str.equals("MHF_Guardian"))
/*  54 */               break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.guardian()); return;case -1305085324: if (!str.equals("MHF_LavaSlime")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.lavaSlime()); return;case -1026949772: if (!str.equals("MHF_Ocelot")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.ocelot()); return;case -900316231: if (!str.equals("MHF_Spider")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.spider()); return;case -791932729: if (!str.equals("MHF_Wither")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.wither()); return;case -775584858: if (!str.equals("MHF_CaveSpider")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.caveSpider()); return;case -700718342: if (!str.equals("MHF_Zombie")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.zombie()); return;case -465347646: if (!str.equals("MHF_EGuardian"))
/*  55 */               break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.eguardian()); return;case -321963154: if (!str.equals("MHF_Blaze")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.blaze()); return;case -317464915: if (!str.equals("MHF_Ghast")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.ghast()); return;case -317246248: if (!str.equals("MHF_Golem")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.ironGolem()); return;case -306379257: if (!str.equals("MHF_Sheep")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.sheep()); return;case -306256012: if (!str.equals("MHF_Slime")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.slime()); return;case -306095650: if (!str.equals("MHF_Squid")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.squid()); return;case -302641037: if (!str.equals("MHF_Witch"))
/*  56 */               break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.witch()); return;case 510436352: if (!str.equals("MHF_PigZombie")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.pigZombie()); return;case 610753377: if (!str.equals("MHF_Chicken")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.chicken()); return;case 787576255: if (!str.equals("MHF_MushroomCow")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.mushroomCow()); return;case 893415194: if (!str.equals("MHF_Creeper")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.creeper()); return;case 1488550170: if (!str.equals("MHF_Villager")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.villager()); return;case 1747150135: if (!str.equals("MHF_Cow")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.cow()); return;case 1747162426: if (!str.equals("MHF_Pig")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.pig()); return;case 1833110886: if (!str.equals("MHF_Enderman")) break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.enderman()); return;case 2129821729: if (!str.equals("MHF_Skeleton"))
/*  57 */               break;  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.skeleton()); return; }  event.setCancelled(true); clearDrop(block); dropItem(loc, SkullManager.player(owner));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   static void clearDrop(Block block) {
/*  64 */     block.setType(Material.AIR);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void deathEntity(EntityDeathEvent event) {
/*  69 */     LivingEntity livingEntity = event.getEntity();
/*  70 */     EntityType type = livingEntity.getType();
/*     */     
/*  72 */     if (event.getEntity().getKiller() != null) {
/*  73 */       Player killer = event.getEntity().getKiller();
/*  74 */       double random = Math.random() * 10000.0D;
/*  75 */       Location loc = livingEntity.getLocation();
/*     */       
/*  77 */       if (livingEntity instanceof Player) {
/*  78 */         if (killer.hasPermission("headdrop.drop.player") && 
/*  79 */           !livingEntity.hasPermission("headdrop.protect") && 
/*  80 */           Config.player_chance > random) {
/*  81 */           loc.getWorld().dropItem(loc, SkullManager.player(livingEntity.getName()));
/*     */         
/*     */         }
/*     */       
/*     */       }
/*  86 */       else if (killer.hasPermission("headdrop.drop.mobs") && 
/*  87 */         Config.mob_chance > random) {
/*  88 */         switch (type) { case SKELETON:
/*  89 */             event.getDrops().add(SkullManager.skeleton()); break;
/*  90 */           case ZOMBIE: event.getDrops().add(SkullManager.zombie()); break;
/*  91 */           case CREEPER: event.getDrops().add(SkullManager.creeper()); break;
/*  92 */           case BLAZE: event.getDrops().add(SkullManager.blaze()); break;
/*  93 */           case CAVE_SPIDER: event.getDrops().add(SkullManager.caveSpider()); break;
/*  94 */           case GHAST: event.getDrops().add(SkullManager.ghast()); break;
/*  95 */           case PIG_ZOMBIE: event.getDrops().add(SkullManager.pigZombie()); break;
/*  96 */           case ENDERMAN: event.getDrops().add(SkullManager.enderman()); break;
/*  97 */           case MAGMA_CUBE: event.getDrops().add(SkullManager.lavaSlime()); break;
/*  98 */           case SLIME: event.getDrops().add(SkullManager.slime()); break;
/*  99 */           case SPIDER: event.getDrops().add(SkullManager.spider()); break;
/* 100 */           case CHICKEN: event.getDrops().add(SkullManager.chicken()); break;
/* 101 */           case PIG: event.getDrops().add(SkullManager.pig()); break;
/* 102 */           case SHEEP: event.getDrops().add(SkullManager.sheep()); break;
/* 103 */           case COW: event.getDrops().add(SkullManager.cow()); break;
/* 104 */           case SQUID: event.getDrops().add(SkullManager.squid()); break;
/* 105 */           case VILLAGER: event.getDrops().add(SkullManager.villager()); break;
/* 106 */           case IRON_GOLEM: event.getDrops().add(SkullManager.ironGolem()); break;
/* 107 */           case MUSHROOM_COW: event.getDrops().add(SkullManager.mushroomCow()); break;
/* 108 */           case OCELOT: event.getDrops().add(SkullManager.ocelot()); break;
/* 109 */           case WOLF: event.getDrops().add(SkullManager.wolf()); break;
/* 110 */           case WITHER: event.getDrops().add(SkullManager.wither()); break;
/* 111 */           case GUARDIAN: event.getDrops().add(SkullManager.guardian()); break;
/* 112 */           case ELDER_GUARDIAN: event.getDrops().add(SkullManager.eguardian()); break;
/* 113 */           case WITCH: event.getDrops().add(SkullManager.witch());
/*     */             break; }
/*     */       
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static void dropItem(Location loc, ItemStack item) {
/* 123 */     loc.getWorld().dropItemNaturally(loc, item);
/*     */   }
/*     */ }


/* Location:              C:\Users\William\Downloads\HeadDrop.jar!\me\baks\hd\PluginListener.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */