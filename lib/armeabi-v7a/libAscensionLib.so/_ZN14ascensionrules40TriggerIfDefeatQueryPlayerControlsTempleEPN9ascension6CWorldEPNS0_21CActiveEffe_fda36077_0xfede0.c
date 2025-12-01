// 函数: _ZN14ascensionrules40TriggerIfDefeatQueryPlayerControlsTempleEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfede0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 8)
    if (*(arg3 + 0x4c) == 0)
        return 0
    
    result = 0
    
    if (ascension::CPlayer::CountTemplesInPlay() s>= arg4)
        return 1

return result
