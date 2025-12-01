// 函数: _ZN14ascensionrules42WhenConstructOwnerAcquiresOtherMechanaCardEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe42c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 0x12)
    void* r12_1 = *(arg2 + 0x10)
    core::CCardInstance* r1 = *(arg3 + 0x4c)
    
    if (r1 == *(r12_1 + 0xc))
        int32_t r2 = *(arg3 + 0x50)
        
        if (r2 != 0 && r2 != *(r12_1 + 0x10))
            return ascension::CWorld::QueryCardFaction(arg1, r1, r2) __tailcall

return 0
