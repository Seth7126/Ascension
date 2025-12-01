// 函数: _ZN14ascensionrules49CreateStateProcessBanishFromHandOrDiscardOrSourceEPN9ascension7CPlayerEibbbNS0_9ECardTypeEPKcPNS0_19CEffectInstanceDataEPN4core13CCardInstanceEPci
// 地址: 0x1373a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* result = arg10
int32_t r10 = arg6.d

if (result == 0 || arg11 s< 0x268)
    char* result_1 = operator new(0x268)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateProcessBanishFromHandOrDiscardOrSource + 8
    *(result + 0x24c) = arg1
    *(result + 0x250) = arg2
    result[0x254] = arg3
    result[0x255] = arg4
    result[0x256] = arg5
    *(result + 0x258) = r10
    *(result + 0x25c) = arg7
    *(result + 0x260) = arg8
    *(result + 0x264) = arg9
else
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessBanishFromHandOrDiscardOrSource + 8
    *(result + 0x24c) = arg1
    *(result + 0x250) = arg2
    result[0x254] = arg3
    result[0x255] = arg4
    result[0x256] = arg5
    *(result + 0x258) = r10
    *(result + 0x25c) = arg7
    *(result + 0x260) = arg8
    *(result + 0x264) = arg9
    result[0x2c] = 0

return result
