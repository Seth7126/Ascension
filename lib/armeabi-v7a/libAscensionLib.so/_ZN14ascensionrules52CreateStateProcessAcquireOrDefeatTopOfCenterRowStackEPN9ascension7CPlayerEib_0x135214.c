// 函数: _ZN14ascensionrules52CreateStateProcessAcquireOrDefeatTopOfCenterRowStackEPN9ascension7CPlayerEib
// 地址: 0x135214
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0_3
void** result

if (*(*(arg1 + 4) + 0x30) u> 0x12)
    void** result_2 = operator new(0x2a4)
    result = result_2
    CGameStateOptions::CGameStateOptions(result_2.b)
    *result = _vtable_for_ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack + 8
    r0_3 = &result[0x97]
    result[0x93] = arg1
    result[0x94] = arg2
    result[0x95].b = arg3
    result[0x96] = 0
else
    void** result_1 = operator new(0x32c)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    result[0x96].w = 0
    *result =
        _vtable_for_ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated + 8
    result[0x97] = 0
    result[0xa9].b = 0
    *(result + 0x25a) = 0
    result[0x93] = arg1
    result[0x94] = arg2
    result[0x95] = 0
    result[0xaa] = _vtable_for_ascension::CEventEnterCenterRow + 8
    result[0xab] = 0x11
    result[0xac] = 0
    result[0xbd] = 0
    result[0xbe] = 0
    result[0xbf] = 0xffffffff
    r0_3 = &result[0xc2]
    result[0xc0] = 0
    result[0xc1] = 0

*r0_3 = 0
return result
