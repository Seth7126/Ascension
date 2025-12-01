// 函数: _Z20ClearPlayerWorldDataPN12AppWorldData15PlayerWorldDataE
// 地址: 0x188b54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg1 == 0)
    return 

if (*(arg1 + 0x10) != 0)
    operator delete(GameOptionManager::~GameOptionManager())

int32_t r0_2 = *(arg1 + 0xc)
*(arg1 + 0x10) = 0

if (r0_2 != 0)
    operator delete(CStateMachine::~CStateMachine())

CState* r0_4 = *(arg1 + 8)
*(arg1 + 0xc) = 0
CState::DeleteState(r0_4)
int32_t* r0_5 = *arg1
*(arg1 + 8) = 0

if (r0_5 != 0)
    (*(*r0_5 + 4))()

*(arg1 + 4) = 0
*arg1 = 0
__builtin_memset(arg1 + 0x14, 0, 0x20)
