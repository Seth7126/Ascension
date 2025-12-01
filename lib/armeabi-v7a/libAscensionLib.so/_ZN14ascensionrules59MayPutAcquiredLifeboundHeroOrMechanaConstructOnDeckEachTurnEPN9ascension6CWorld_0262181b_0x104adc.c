// 函数: _ZN14ascensionrules59MayPutAcquiredLifeboundHeroOrMechanaConstructOnDeckEachTurnEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x104adc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 6 && ascension::CWorld::HasPlayedActiveEffect(arg1) == 0)
    core::CCardInstance* r10_1 = *(arg3 + 0x4c)
    
    if (*(*(arg2 + 0x10) + 0xc) == r10_1)
        result = 1
        
        if (*(arg3 + 0x50) s>= 1)
            int32_t r4_1 = 0
            int32_t i = 0
            
            do
                void* r2 = *(*(arg3 + 0x54) + r4_1)
                int32_t r0_8 = *(*(r2 + 0xc) + 0x88)
                ascension::CWorld* r0_9
                core::CCardInstance* r1
                
                if (r0_8 == 2)
                    r0_9 = arg1
                    r1 = r10_1
                label_104b7c:
                    
                    if (ascension::CWorld::QueryCardFaction(r0_9, r1, r2) != 0)
                        int32_t var_28_1 = 0
                        ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::AddAcquireLocation(
                            (*(arg3 + 0x54)).b + r4_1.b, 2, 0, (*(arg2 + 8)).b)
                else if (r0_8 == 1)
                    r0_9 = arg1
                    r1 = r10_1
                    goto label_104b7c
                i += 1
                r4_1 += 0x44
            while (i s< *(arg3 + 0x50))

return result
