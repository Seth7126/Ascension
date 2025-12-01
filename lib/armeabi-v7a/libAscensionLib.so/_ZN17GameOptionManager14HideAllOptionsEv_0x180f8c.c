// 函数: _ZN17GameOptionManager14HideAllOptionsEv
// 地址: 0x180f8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_i
void* r1_2 = *(entry_i + 0x3fc)

if (r1_2 == 0)
    return 

entry_i = *(r1_2 + 0x98)

if (entry_i s< 1)
    return 

char* r1_1 = *(r1_2 + 0xa0) + 8
void* i

do
    *r1_1 = 1
    r1_1 = &r1_1[0x40]
    i = entry_i
    entry_i -= 1
while (i != 1)
