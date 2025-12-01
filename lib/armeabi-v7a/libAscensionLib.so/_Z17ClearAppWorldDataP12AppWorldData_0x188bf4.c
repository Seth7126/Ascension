// 函数: _Z17ClearAppWorldDataP12AppWorldData
// 地址: 0x188bf4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ClearPlayerWorldData(arg1 + 0x124)
ClearPlayerWorldData(arg1 + 0x158)
ClearPlayerWorldData(arg1 + 0x18c)
ClearPlayerWorldData(arg1 + 0x1c0)
int32_t* r0_4 = *(arg1 + 0x1f4)

if (r0_4 != 0)
    (*(*r0_4 + 4))()

int32_t r0_5 = *(arg1 + 0xa28)
*(arg1 + 0x1f4) = 0

if (r0_5 != 0)
    operator delete(NetworkChatList::~NetworkChatList())
    *(arg1 + 0xa28) = 0

void* result = *(arg1 + 0x120)

if (result != 0)
    operator delete[](result)
    result = nullptr
    *(arg1 + 0x11c) = 0

return result
