// 函数: _ZN14ascensionrules51WhenOwnerAcquiresEffectDataMatchedCardFromCenterRowEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe72c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg3 + 4) == 0x12)
    int32_t r0_1 = *(arg3 + 0x54)
    
    if (r0_1 == 9 || r0_1 == 7)
        int32_t r0_2 = *(arg2 + 0x10)
        core::CCardInstance* r5_1 = *(arg3 + 0x4c)
        
        if (r5_1 == *(r0_2 + 0xc))
            int32_t r6_1 = *(arg3 + 0x50)
            
            if (r6_1 != 0 && ascension::CCardInPlayInstance::GetEffectData(r0_2) != 0)
                return ascension::CWorld::QueryCardFaction(arg1, r5_1, r6_1) __tailcall

return 0
