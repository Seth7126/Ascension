// 函数: _ZN14ascensionrules41TriggerIfTurnPlayerHasPlayedLifeboundHeroEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfec30
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r10 = *(arg1 + 0xb20)

if (r10 != 0)
    int32_t* r7_1 = *(arg1 + 0xb80)
    int32_t r5_1 = *(arg1 + 0xb84)
    
    if (r7_1 != r5_1)
        do
            if ((zx.d(r7_1[1].b) & 1) == 0)
                void* r6_1 = *r7_1
                
                if (r6_1 != 0)
                    int32_t r0_6 = *(r6_1 + 0xc)
                    
                    if (r0_6 != 0)
                        void* r0_1 = __dynamic_cast(r0_6, _typeinfo_for_core::CCard, 
                            _typeinfo_for_ascension::CCard, 0)
                        
                        if (r0_1 != 0 && *(r0_1 + 0x88) == 1)
                            if (ascension::CWorld::QueryCardFaction(arg1, r10, r6_1) != 0)
                                return 1
                            
                            r5_1 = *(arg1 + 0xb84)
            
            r7_1 = &r7_1[2]
        while (r7_1 != r5_1)

return 0
