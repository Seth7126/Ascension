// 函数: _ZNK9ascension26CTriggeredEffectDefinition11HandleEventEPNS_6CWorldEPNS_21CActiveEffectInstanceEPNS_6CEventE
// 地址: 0xe73ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (ascension::CActiveEffectDefinition::CheckEffectConditions(arg1, arg2, arg3) != 0)
    void* entry_r3
    uint32_t r1_1 = zx.d(*(entry_r3 + 8))
    result = 1
    
    if (r1_1 u<= 7)
        *(entry_r3 + 8) = r1_1.w + 1
        *(entry_r3 + (r1_1 << 2) + 0xc) = arg3

return result
