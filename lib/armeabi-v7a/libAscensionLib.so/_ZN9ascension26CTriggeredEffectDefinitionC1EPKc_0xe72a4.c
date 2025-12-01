// 函数: _ZN9ascension26CTriggeredEffectDefinitionC1EPKc
// 地址: 0xe72a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** r0 = arg1
*r0 = _vtable_for_ascension::CActiveEffectDefinition + 8
__aeabi_memclr8(&r0[2], 0x54)
char* entry_r1

if (entry_r1 != 0)
    strncpy(&arg1[0x1c], entry_r1, 0x40)
    arg1[0x5b] = 0

__aeabi_memclr4(&arg1[0x5c], 0x168)
*arg1 = _vtable_for_ascension::CTriggeredEffectDefinition + 8
__aeabi_memclr4(&arg1[0x1c4], 0x1b8)
